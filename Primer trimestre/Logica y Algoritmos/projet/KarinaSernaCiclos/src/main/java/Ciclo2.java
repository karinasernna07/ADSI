
import java.util.Scanner;


public class Ciclo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numero,acumulador=0,suma=0;
        float promedio;
        boolean sw=true;
        while(sw){
        System.out.println("DIGITE UN NUMERO");
        numero=teclado.nextInt();
 
        sw=((numero>0) && (!(numero%6==0)));
            suma+=numero;
            acumulador++;
       
        }
          promedio=(float)suma/acumulador;
        System.out.println("EL PROMEDIO ES "+promedio);

    }
}
