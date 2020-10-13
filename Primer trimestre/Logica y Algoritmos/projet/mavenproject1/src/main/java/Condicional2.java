
import java.util.Scanner;


public class Condicional2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int numLlantas,LLANTA1=300,LLANTA2=250,LLANTA3=200,vTotal,vLlanta;
        
        System.out.println("INGRESE LA CANTIDAD DE LLANTAS A LLEVAR");
        numLlantas=teclado.nextInt();
        
        if (numLlantas>10){
            vLlanta=LLANTA3;
        }else{
            if(numLlantas>=5){
                vLlanta=LLANTA2;
            }else{
                vLlanta=LLANTA1;
            }
                
        }
        vTotal=numLlantas*vLlanta;
        System.out.println("EL VALOR DE CADA LLANTA ES DE "+vLlanta);
        System.out.println("EL VALOR TOTAL DE LAS LLANTAS A LLEVAR ES "+vTotal);

    }
    
}
