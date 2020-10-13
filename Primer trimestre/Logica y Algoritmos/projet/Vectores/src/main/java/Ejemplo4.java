
import java.util.Scanner;

/*
Crear un vector de n posiciones. Ingresar numeros enteros
Sume elementos que se encuentran en las posiciones pares
 */
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double acumulador=0;
        int n;
        System.out.println("Ingrese la longitud del vector");
        n=teclado.nextInt();
        
        //Declarar el vector en el tamaño n
        int numero[] = new int [n];
        
        //Ingresar elementos al vector numero[]
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingresar el numero");
            numero[i]=teclado.nextInt();
            
        }
        //Sumar posiciones pares
        for (int i = 0; i < numero.length; i++) {
            if(i%2==0 && i!=0){
                acumulador=acumulador+numero[i];
            }
            
        }
        System.out.println("La suma de las posiciones pares es "+acumulador);
        
    }
    
}
