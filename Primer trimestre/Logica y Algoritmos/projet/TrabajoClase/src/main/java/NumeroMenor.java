
import java.util.Scanner;


public class NumeroMenor {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int n,edad,auxEdad=0;
        double acumulador=0,promedio;
        System.out.println("digite el numero de ingresos");
        n=teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese la edad");
            edad=teclado.nextInt();
            
            if(i == 0){
                auxEdad=edad;
            }else{
                if(edad<auxEdad){
                    auxEdad=edad;
                }

            }
            acumulador=acumulador+edad;

        }
         promedio=acumulador/n;
        System.out.println("**********************");
        System.out.println(auxEdad);
        System.out.println("EL PROMEDIO DE LAS EDADES ES "+promedio);
    }
}

