
import java.util.Scanner;

/*
Crear un vector de 10 numeros ingresados por el usuario,
leer un valor y lo inserte en el lugar que corresponda de tal manera
que el arreglo conserve su ornedamiento e imprima el vector
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int aux;
        int [] numero = new int [10];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            numero[i]=teclado.nextInt();
            
        }
        for (int i = 0; i < numero.length-1; i++) {
            for (int j = 0; j < numero.length-1; j++) {
                if (numero[j] > numero[j+1]) {
                    aux = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = aux;
                    
                }
                
            }
            
        }
        System.out.print("El arreglo ordenado es ");
        System.out.println(" ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]+" ");
            
        }
        
    }
    
}
