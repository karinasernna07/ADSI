
import java.util.Scanner;


public class Condicional3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
         int num;
         
         System.out.println("INGRESE EL PRIMER NUMERO DE SU CODIGO");
         num=teclado.nextInt();
         
         if ((num%2==0)&&(num%3==0)&&(num%5==0)){
             System.out.println("SU CARGO ES: DIRECTOR GENERAL ");
         }else{
             if ((!(num%2==0))&&(num%3==0)&&(num%5==0)){
                 System.out.println("SU CARGO ES: DIRECTIVO");
             }else{
                 if((num%2==0)&&(!(num%3==0))&&(!(num%5==0))){
                     System.out.println("SU CARGO ES: PERSONAL");
                 }else{
                     if((!(num%2==0))&&(!(num%3==0))&&(!(num%5==0))){
                         System.out.println("SU CARGO ES: SEGURIDAD");
                     }
                 }
             }
         }
         
        
    }
    
}
