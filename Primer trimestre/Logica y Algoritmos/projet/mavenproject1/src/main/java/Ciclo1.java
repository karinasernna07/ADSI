
import java.util.Scanner;


public class Ciclo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numb2=1;
        
        
        while(((numb2%2==0)&&(!(numb2%5==0))&&(numb2>100)&&(numb2<10000))==false){
            System.out.println("INGRESE UN NUMERO");
            numb2=teclado.nextInt();
            
            
            if(((numb2%2==0)&&(!(numb2%5==0))&&(numb2>100)&&(numb2<10000))){
                System.out.println("EL NUMERO NO CUMPLE CON LOS CRITERIOS");
            }
           
        }
        System.out.println("EL NUMERO CUMPLE CON LOS CRITERIOS");

        
    }
    
}
