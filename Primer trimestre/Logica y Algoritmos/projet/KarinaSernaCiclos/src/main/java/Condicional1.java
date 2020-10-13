
import java.util.Scanner;


public class Condicional1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        String color;
        double VERDE=0.10,AMARILLA=0.25,AZUL=050,ROJA=1.0,descuento = 0,totalPagar,compra;

        
        System.out.println("INGRESE EL VALOR TOTAL DE LA COMPRA");
        compra=teclado.nextInt();
        System.out.println("INGRESE EL COLOR DE LA BOLITA QUE SACO");
        color=teclado.next();
                
         if(color.equals("roja")){
             descuento=compra*ROJA;
             System.out.println("FELICITACIONES USTED TIENE UN DESCUENTO DEL 100%");
         }else {
             if(color.equals("azul")) {
                 descuento=compra*AZUL;
                 System.out.println("USTED OBTUVO UN DESCUETO DEL 50%");
                 
             }else{
                 if(color.equals("amarilla")){
                     descuento=compra*AMARILLA;
                     System.out.println("USTED OBTUVO UN DESCUENTO DEL 25%");
                 }else {
                     if(color.equals("verde")){
                         descuento=compra*VERDE;
                         System.out.println("USTED OBTUVO UN DESCUENTO DEL 10%");
                     }
                 }
             }
         }    
        totalPagar=compra-descuento;
        System.out.println("EL TOTAL DE SU COMPRA ES "+totalPagar);

   
    }
    
}

