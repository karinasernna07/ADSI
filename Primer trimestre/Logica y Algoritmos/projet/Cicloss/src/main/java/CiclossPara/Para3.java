
package CiclossPara;

import java.util.Scanner;

public class Para3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int i,num,contador=0;
        double acumulador=0,promedio;
        
        for (i=1;i<=5;i++){
            System.out.println("INGRESE EL NUMERO");
            num=teclado.nextInt();
            acumulador=acumulador+1;
            if(num>500){
                contador=contador+1;
            }
        }
        promedio=acumulador/5;
        System.out.println("EL PROMEDIO ES "+promedio);
        System.out.println("NUMEROS MAYORES A 500 SON "+contador);
        

    }
    
}
