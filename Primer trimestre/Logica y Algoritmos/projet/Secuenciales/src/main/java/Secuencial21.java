
import java.util.Scanner;


public class Secuencial21 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int A,B,AUX;
        
        System.out.println("INGRESE VALOR DE A");
        A=teclado.nextInt();
        System.out.println("INGRESE EL VALOR DE B");
        B=teclado.nextInt();
        
        AUX=(int) A;
        A=(int) B;
        B=(int) AUX;
        
        System.out.println("A ES "+A);
        System.out.println("B ES "+B);
        
    }
}
