
import java.util.Scanner;


public class Secuencal17 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double metro,total;
        
        System.out.println("INGRESE CANTIDAD DE METROS PARA PASARLA A CM");
        metro=teclado.nextDouble();
        
        total=metro*100;
        
        System.out.println("LA CANTIDAD DE CENTIMETROS ES: "+total+"Cm");
                 
        
    }
    
}
