
import java.util.Scanner;


public class Condicional5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int numero;
        
        System.out.println("INGRESE UN NUMERO");
        numero=teclado.nextInt();
        
        if(numero%2==0){
            System.out.println("SU NUMERO ES PAR");
        }
        else {
            System.out.println("SU NUMERO ES IMPAR");
        }

    }
    
}
