
import java.util.Scanner;


public class Condicional6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int numero;
        
        System.out.println("INGRESE UN NUMERO");
        numero=teclado.nextInt();
        
        if(numero%3==0){
            System.out.println("SU NUMERO ES DIVISIBLE POR 3");
        }
        else{
            System.out.println("SU NUMERO NO ES DIVISIBLE POR 3");
        }
    }
    
}
