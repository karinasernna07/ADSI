
import java.util.Scanner;


public class Secuencial9 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double altura,total,pie;
        
        System.out.println("INGRESE SU ALTURA EN CM");
        altura=teclado.nextDouble();
         
        total=altura/2.54;
        pie=total/12;
        
        System.out.println("EL TOTAL DE LA ALTURA EN PULGADAS ES "+total);
        System.out.println("EL TOTAL EN PIE ES: "+pie);
        
    }
    
}
