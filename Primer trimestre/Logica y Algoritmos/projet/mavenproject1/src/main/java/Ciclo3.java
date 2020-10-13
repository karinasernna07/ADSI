
import java.util.Scanner;


public class Ciclo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double numero,n,auxN=0,auxMenor=0;
        
        
        System.out.println("INGRESE N NUMERO");
        numero=teclado.nextDouble();
        
        for (int i =1 ; i <=numero; i++) {
           
            System.out.println("INGRESE UN NUMERO");
            n=teclado.nextDouble();

        if(n>auxN){
            auxN=n;   
            
            if(n<auxMenor){
                auxMenor=n;
            }
        }
        }
        System.out.println("EL NUMERO MAYOR ES "+auxN);
        System.out.println("EL NUMERO MENOR ES "+auxMenor);

    }
}
