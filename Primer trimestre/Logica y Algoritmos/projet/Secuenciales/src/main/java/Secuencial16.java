
import java.util.Scanner;


public class Secuencial16 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double num1,num2,num3,total;
        
        System.out.println("INGRESE SU PRIMER NUMERO");
        num1=teclado.nextDouble();
        System.out.println("INGRESE SU SEGUNDO NUMERO");
        num2=teclado.nextDouble();
        System.out.println("INGRESE SU TECER NUMERO");
        num3=teclado.nextDouble();
        
        total=(num1+num2+num3)/5;
        
        System.out.println("LA QUINTA PARTE DE SU SUMA ES: "+total);
        
    }
    
}
