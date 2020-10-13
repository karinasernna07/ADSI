
import java.util.Scanner;


public class Secuencial22 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int a,b;
        
        System.out.println("INGRESE EL VALOR DE A");
        a=teclado.nextInt();
        System.out.println("INGRESE EL VALOR DE B");
        b=teclado.nextInt();
        
        b=(int) a-b;
        a=(int) a-b;
        b=(int) a+b;
        
        System.out.println("EL RESULTADO DE A ES "+a);
        System.out.println("EL RESULTAD DE B ES "+b);
        
    }
    
}
