/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;
import java.io.File;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XmlFactura {
    public static void crearXML(Factura factura){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document documento = implementation.createDocument(null, "factura" + factura.getNumero(), null);
            documento.setXmlVersion("1.0");
            
            Element empresa = documento.createElement("empresa");
            Element empresaN = documento.createElement("nombre");
            Element empresaC = documento.createElement("cedula");
            empresa.appendChild(empresaN);
            empresa.appendChild(empresaC);
            empresaN.appendChild(documento.createTextNode(sistemadefacturacion.logic.Service.instancia().getEmpresa().getNombre()));
            empresaC.appendChild(documento.createTextNode(sistemadefacturacion.logic.Service.instancia().getEmpresa().getCedulaJuridica()));
            
            Element fecha = documento.createElement("fecha");
            fecha.appendChild(documento.createTextNode(factura.getFecha()));
            
            Element cliente = documento.createElement("cliente");
            Element clienteN = documento.createElement("nombre");
            Element clienteC = documento.createElement("cedula");
            Element clienteE = documento.createElement("email");
            Element clienteT = documento.createElement("telefono");
            cliente.appendChild(clienteN);
            cliente.appendChild(clienteC);
            cliente.appendChild(clienteE);
            cliente.appendChild(clienteT);
            clienteN.appendChild(documento.createTextNode(factura.getCliente().getNombre()));
            clienteC.appendChild(documento.createTextNode(factura.getCliente().getCedula()));
            clienteE.appendChild(documento.createTextNode(factura.getCliente().getCorreoElec()));
            clienteT.appendChild(documento.createTextNode(factura.getCliente().getTelefono()));
            
            Element productos = documento.createElement("productos");
            
            DecimalFormat df = new DecimalFormat("####");
            for (Linea linea : factura.getLineas()) {
                Element productosN = documento.createElement("nombre");
                Element productosC = documento.createElement("cantidad");
                Element productosP = documento.createElement("precio");
                productos.appendChild(productosN);
                productosN.appendChild(documento.createTextNode(linea.getProducto().getNombre()));
                productosN.appendChild(productosC);
                productosN.appendChild(productosP);
                productosC.appendChild(documento.createTextNode(String.valueOf(linea.getCantidad())));
                productosP.appendChild(documento.createTextNode(String.valueOf(df.format(linea.getTotal()))));
            }
            Element productosT = documento.createElement("total");
            productos.appendChild(productosT);
            productosT.appendChild(documento.createTextNode(String.valueOf(df.format(factura.Total()))));
            
            documento.getDocumentElement().appendChild(empresa);            
            documento.getDocumentElement().appendChild(fecha);
            documento.getDocumentElement().appendChild(cliente);
            documento.getDocumentElement().appendChild(productos);
            
            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("Factura N. "+factura.getNumero() + ".xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        } 
        catch (ParserConfigurationException | TransformerException ex) {
            Logger.getLogger(XmlFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
