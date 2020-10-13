
import java.util.Scanner;


public class Ciclo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int cont=0, num=0, nummayor=0, nummenor=0, solc;
        
        System.out.println("Ingrese el numero de solicitudes");
        solc=teclado.nextInt();
        
        while(cont<solc) {
        
            System.out.println("Ingrese un numero");
            num=teclado.nextInt();
        if (cont==0){
            
        
        nummayor=num;
        nummenor=num;                              
        }
        else {
             if (num > nummayor){
                    nummayor=num;
                }
             else{      
                        if (num < nummenor){
                        nummenor=num;
                }       
                  }
              }
        
        cont=cont+1;
        }
        
        System.out.println("El numero mayor es "+nummayor);
        System.out.println("El numero menor es "+nummenor);
       

    
        

    }
}
