
import java.util.Scanner;


public class Ciclo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num;
        boolean sw=true;
        
        while (sw){
            System.out.println("INGRESE UN NUMERO");
            num=teclado.nextInt();
            sw=((num%2==0)&&(!(num%5==0))&&(num>100)&&(num<10000));

        }
        System.out.println("***FIN DEL PROCESO");
        
    }
    
}
