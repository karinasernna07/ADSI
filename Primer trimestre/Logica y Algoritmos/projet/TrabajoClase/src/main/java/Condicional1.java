
import java.util.Scanner;


public class Condicional1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int numPantalones;
        double totalPagar,totalCompra,descuento;
        double PORC1=0.25,PORC2=0.15;
        
        System.out.println("INGRESE EL NUMERO DE PANTALONES");
        numPantalones=teclado.nextInt();
        
        System.out.println("INGRESE EL VALOR DE LA COMPRA");
        totalCompra=teclado.nextDouble();
        
        if(numPantalones>=3){
            descuento=totalCompra*PORC1;
            
        }else {
            descuento=totalCompra*PORC2;
        }
        totalPagar=totalCompra-descuento;
        
        System.out.println("EL TOTAL DE LA COMPRA ES: "+descuento);
        
    }
}
