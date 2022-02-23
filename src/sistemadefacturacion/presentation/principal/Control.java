/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.presentation.principal;

public class Control {
    private Model model;
    private Interfaz view;
    private sistemadefacturacion.presentation.empresa.Control controlEmpresa;
    private sistemadefacturacion.presentation.empresa.Model modelEmpresa;
    private sistemadefacturacion.presentation.empresa.Interfaz interfazEmpresa;
    private sistemadefacturacion.presentation.cliente.Control controlCliente;
    private sistemadefacturacion.presentation.cliente.Model modelCliente;
    private sistemadefacturacion.presentation.cliente.Interfaz interfazCliente;
    private sistemadefacturacion.presentation.producto.Control controlProducto;
    private sistemadefacturacion.presentation.producto.Model modelProducto;
    private sistemadefacturacion.presentation.producto.Interfaz interfazProducto;
    private sistemadefacturacion.presentation.factura.Control controlFactura;
    private sistemadefacturacion.presentation.factura.Model modelFactura;
    private sistemadefacturacion.presentation.factura.Interfaz interfazFactura;
    
    public Control(Model model, Interfaz view){
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setControl(this);
        initOptionsEmpresa();
        initOptionsClientes();
        initOptionsProductos();
        initOptionsFacturas();
    }
    
    public void empresaShow(){
        modelEmpresa.setListC(sistemadefacturacion.logic.Service.instancia().getClientes());
        modelEmpresa.setListP(sistemadefacturacion.logic.Service.instancia().getProductos());
        modelEmpresa.setListF(sistemadefacturacion.logic.Service.instancia().getFacturas());
        modelEmpresa.setCurrent(sistemadefacturacion.logic.Service.instancia().getEmpresa());
        modelEmpresa.commit();
        controlEmpresa.show();
    }
    
    public void clienteShow(){
        controlCliente.show();
    }
    
    public void productoShow(){
        controlProducto.show();
    }
    
    public void facturaShow(){
        modelFactura.setListF(sistemadefacturacion.logic.Service.instancia().getFacturas());
        modelFactura.setListC(sistemadefacturacion.logic.Service.instancia().getClientes());
        modelFactura.setListP(sistemadefacturacion.logic.Service.instancia().getProductos());
        modelFactura.commit();
        controlFactura.show();
    }
    
    public void initOptionsEmpresa(){ // Inicializa los atributos de la ventana empresa
        modelEmpresa = new sistemadefacturacion.presentation.empresa.Model();
        interfazEmpresa = new sistemadefacturacion.presentation.empresa.Interfaz();
        controlEmpresa = new sistemadefacturacion.presentation.empresa.Control(modelEmpresa, interfazEmpresa);
    }
    
    public void initOptionsClientes(){ // Inicializa los atributos de la ventana clientes
        modelCliente = new sistemadefacturacion.presentation.cliente.Model();
        interfazCliente = new sistemadefacturacion.presentation.cliente.Interfaz();
        controlCliente = new sistemadefacturacion.presentation.cliente.Control(modelCliente, interfazCliente);
    }
    
    public void initOptionsProductos(){
        modelProducto = new sistemadefacturacion.presentation.producto.Model();
        interfazProducto = new sistemadefacturacion.presentation.producto.Interfaz();
        controlProducto = new sistemadefacturacion.presentation.producto.Control(modelProducto, interfazProducto);
    }
    
    public void initOptionsFacturas(){
        modelFactura = new sistemadefacturacion.presentation.factura.Model();
        interfazFactura = new sistemadefacturacion.presentation.factura.Interfaz();
        controlFactura = new sistemadefacturacion.presentation.factura.Control(modelFactura, interfazFactura);
    }

    public void store() {
        sistemadefacturacion.logic.Service.instancia().store();
    }
}
