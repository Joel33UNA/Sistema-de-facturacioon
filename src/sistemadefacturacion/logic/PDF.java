/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistemadefacturacion.logic;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.*;
import java.text.DecimalFormat;

public class PDF {
    public static void createPdf(Factura factura) throws IOException {
        String dest = "Factura N. "+factura.getNumero()+".pdf";
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4.rotate());
        document.setMargins(20, 20, 20, 20);

        ImageData data = ImageDataFactory.create("logooooo.PNG");        
        Image img = new Image(data); 
        document.add(img);
        
        document.add(new Paragraph(""));
        document.add(new Paragraph("Empresa: "+sistemadefacturacion.logic.Service.instancia().getEmpresa().getNombre() + "                                                                          Número de factura: "+factura.getNumero()).setFont(font).setBold().setFontSize(20f));
        document.add(new Paragraph("Ced. Jurídica: "+sistemadefacturacion.logic.Service.instancia().getEmpresa().getCedulaJuridica() + "                                                                            Fecha y hora: "+ factura.getFecha()).setFont(font).setFontSize(16f));
        document.add(new Paragraph("Cliente: "+factura.getCliente().getNombre()).setFont(font).setFontSize(16f));

        Table table = new Table(5);
        Cell c; 
        Color bkg = ColorConstants.BLUE;
        Color frg= ColorConstants.WHITE;
        c= new Cell(); c.add(new Paragraph("Cantidad")).setBackgroundColor(bkg).setFontColor(frg); 
        table.addHeaderCell(c);
        c= new Cell(); c.add(new Paragraph("Código")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);     
        c= new Cell(); c.add(new Paragraph("Descripción")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Precio unitario")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Total")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);                    
        
        DecimalFormat df = new DecimalFormat("####");
        for(int i=0;i<factura.getLineas().size();i++){
            table.addHeaderCell(String.valueOf(factura.getLineas().get(i).getCantidad()));
            table.addHeaderCell(String.valueOf(factura.getLineas().get(i).getProducto().getCodigo()));
            table.addHeaderCell(String.valueOf(factura.getLineas().get(i).getProducto().getNombre()));  
            table.addHeaderCell(String.valueOf(df.format(factura.getLineas().get(i).getProducto().getPrecio())));             
            table.addHeaderCell(String.valueOf(df.format(factura.getLineas().get(i).getTotal())));               
        }
        c= new Cell(1,4);  c.add(new Paragraph("Total: ")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
        table.addHeaderCell(c);  
        
        c= new Cell();  c.add(new Paragraph(String.valueOf(df.format(factura.Total())))).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);         
        document.add(table);
        document.close();
    }

}