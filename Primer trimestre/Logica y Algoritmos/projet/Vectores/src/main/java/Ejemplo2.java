
import java.util.Scanner;


public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int n;
        double acumuladorSuma=0;
        
        System.out.println("Ingrese la longitud del vector");
        n=teclado.nextInt();
        
        //Crear el vector
        int numero[] = new int [n];
        
        //Ingresar los numeros del vector
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el numero");
            numero[i]=teclado.nextInt();
            
        }
        System.out.println("*****************");
        System.out.println("1.Lista de numeros");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
            
        }
        System.out.println("******************");
        System.out.println("2. Lista de numeros multiplos de 3");
        //Listar los multiplos de 3
        
        for (int i = 0; i < numero.length; i++) {
           if (numero[i]%3==0){   
               System.out.println(numero[i]);
        }
            
        }
        //Sumar los numeros mayores de 10
        System.out.println("*******************");
        System.out.println("3. Suma de los numeros mayores de 10");
        for (int i = 0; i < numero.length; i++) {
            if(numero[i]>10){
                acumuladorSuma=acumuladorSuma+numero[i];
            }
            
        }
        System.out.println(acumuladorSuma);
        
    }
    
}
