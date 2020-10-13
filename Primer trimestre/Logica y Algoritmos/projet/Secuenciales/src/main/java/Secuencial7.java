
import java.util.Scanner;


public class Secuencial7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double numero,total;
        
        System.out.println("INGRESE SU NUMERO");
        numero=teclado.nextDouble();
        
        total=numero*numero;
        
        System.out.println("EL CUADRADO DEL NUMERO QUE INGRESO ES: "+total);
        
        
    }
    
}
