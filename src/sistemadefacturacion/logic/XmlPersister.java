/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import sistemadefacturacion.data.Data;

public class XmlPersister {

    private String path;
    private static XmlPersister instancia;
    
    public static XmlPersister instancia(){
        if (instancia == null){ 
            instancia = new XmlPersister("facturacion.xml");
        }
        return instancia;
    }

    private XmlPersister(String path) {
        this.path = path;
    }
    
    public Data load() throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
        FileInputStream is = new FileInputStream(path);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Data result  = (Data) unmarshaller.unmarshal(is);
        is.close();
        return result;
    }
    
    public void store(Data d) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
        FileOutputStream os = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(d, os);
        os.flush();
        os.close();
    }
    
}
