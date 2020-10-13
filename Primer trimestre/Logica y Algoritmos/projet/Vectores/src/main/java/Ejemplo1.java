
import java.util.Scanner;

/*
Crear un vector de 5 posiciones que almacene nombres, imprima 
el vector
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        //Creamos un vector de tipo String para almacenar nombres
        String [] nombre = new String[5];
        
        //Ingresar los nombres al vector
        for (int i = 0; i < nombre.length; i++) {
            
            System.out.println("Ingrese el nombre");
            nombre[i]=teclado.next();
            
            
        }
        //Imprimir el vector del nombre
        System.out.println("********************");
        System.out.println("Lista de los nombres del vector");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
            
        }
    }
    
}
