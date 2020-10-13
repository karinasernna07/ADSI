
import java.util.Scanner;


public class BanderaBoleana {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int numero;
        boolean sw=true;
        
        while (sw){
            System.out.println("INGRESE UN NUMERO");
            numero=teclado.nextInt();
            sw=!(numero>=0 && numero<=10);
            
        
        }
      

        
    }
    
}
