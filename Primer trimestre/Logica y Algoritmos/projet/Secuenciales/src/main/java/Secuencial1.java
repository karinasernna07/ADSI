
import java.util.Scanner;


public class Secuencial1 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        double numero1,numero2,numero3,resultado,resultadoSuma;
        
        System.out.println("Ingrese un numero el cual desee sumar");
        numero1=teclado.nextDouble();
        System.out.println("ingrese otro numero");
        numero2=teclado.nextDouble();
        
        resultadoSuma=numero1+numero2;
        
        System.out.println("Ingrese un numero por el cual desea dividir");
        numero3=teclado.nextDouble();
        

        resultado=resultadoSuma/numero3;
        
        System.out.println("el resultado de la suma es"+resultadoSuma);
        System.out.println("El resultado de su operación es: "+resultado);
        
    }
}
