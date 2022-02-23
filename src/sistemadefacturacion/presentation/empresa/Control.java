/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.empresa;

public class Control {
    private Model model;
    private Interfaz interfaz;
    
    public Control(Model model, Interfaz interfaz){
        this.model = model;
        this.interfaz = interfaz;
        this.interfaz.setModel(model);
        this.interfaz.setControl(this);
        initComponentsEmpresa();
    }
    
    public void initComponentsEmpresa(){
        this.interfaz.setjTextFieldCedula(sistemadefacturacion.logic.Service.instancia().informacion.getEmpresa().getCedulaJuridica());
        this.interfaz.setjTextFieldNombre(sistemadefacturacion.logic.Service.instancia().informacion.getEmpresa().getNombre());
        this.interfaz.setjTextFieldProductos(String.valueOf(sistemadefacturacion.logic.Service.instancia().informacion.getNProductos()));
        this.interfaz.setjTextFieldClientes(String.valueOf(sistemadefacturacion.logic.Service.instancia().informacion.getNClientes()));
        this.interfaz.setjTextFieldFacturas(String.valueOf(sistemadefacturacion.logic.Service.instancia().informacion.getNFacturas()));
    }
    
    public void setEmpresa(String nombre, String cedula){
        try{
        sistemadefacturacion.logic.Service.instancia().informacion.getEmpresa().setNombre(nombre);
        sistemadefacturacion.logic.Service.instancia().informacion.getEmpresa().setCedulaJuridica(cedula);
        if(sistemadefacturacion.logic.Service.instancia().getFacturas().isEmpty()){
            return;
        }else{     
            for(int i=0;i<sistemadefacturacion.logic.Service.instancia().getFacturas().size();i++){
                sistemadefacturacion.logic.Service.instancia().getFacturas().get(i).getEmpresa().setNombre(nombre);
                sistemadefacturacion.logic.Service.instancia().getFacturas().get(i).getEmpresa().setNombre(cedula);
            }
        }
        model.setCurrent(sistemadefacturacion.logic.Service.instancia().informacion.getEmpresa());
        model.commit();
        }
        catch(Exception e){}
    }
    
    public void show(){
        model.setCurrent(sistemadefacturacion.logic.Service.instancia().informacion.getEmpresa());
        model.setListF(sistemadefacturacion.logic.Service.instancia().informacion.getFacturas());
        model.setListP(sistemadefacturacion.logic.Service.instancia().informacion.getProductos());
        model.setListC(sistemadefacturacion.logic.Service.instancia().informacion.getClientes());
        model.commit();
        interfaz.show(true);
    }
}
