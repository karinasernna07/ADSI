
import java.util.Scanner;


public class Secuencial2 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double numero,resultado;
        
        System.out.println("Ingrese un numero al cual desea sacrale la raiz cuadrada");
        numero=teclado.nextDouble();
        
        resultado= Math.sqrt(numero);
        System.out.println("La Raiz cuadrada del numero ingresado es: "+resultado);
    }
}
