
import java.util.Scanner;


public class Ciclo4 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        
        int n;
        
        System.out.println("digite un numero");
      
        n = datos.nextInt();
        while(!(n>10)){
            System.out.println("el numero"+n+"cumple la condicion");
            System.out.println("digite otro numero");
            
            n=datos.nextInt();
            System.out.println("el numero"+n+"no cumple la condicion.finaliza el ciclo");
        }
    }    
}