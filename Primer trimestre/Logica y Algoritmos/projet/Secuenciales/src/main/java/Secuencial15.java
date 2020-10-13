
import java.util.Scanner;


public class Secuencial15 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double f,c;
        
        System.out.println("INGRESE SU TEMPERATURA EN CELCIUS C°");
        c=teclado.nextDouble();
        
        f=(double) (((c*9)/5)+32);
        
        System.out.println("LA TEMPERATURA EN GRADOS FAHRENHEIT ES: "+f);
    }
    
}
