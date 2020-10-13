
import java.util.Scanner;


public class Ciclo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int n;
        System.out.println("INGRESE UN NUMERO");
        n=teclado.nextInt();
        
        while(!(n>10)){
            System.out.println("el numero cumple con la función");
            System.out.println("INGRESE OTRO NUMERO");
            n=teclado.nextInt();
        }
        System.out.println("el numero no cumple con la funcion");
    }
    
}
