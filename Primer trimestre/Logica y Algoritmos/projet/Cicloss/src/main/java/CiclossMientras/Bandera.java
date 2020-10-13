
package CiclossMientras;

import java.util.Scanner;

public class Bandera {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String sw;
        int edad,contadorMayores=0,contadorTotal=0;
        double promedioMayores,acumuladorMayores=0;
        
        System.out.println("Desea ingresar registros s/n");
        sw=teclado.next();
        while (sw.equals("s")){
            System.out.println("Ingrese la edad");
            edad=teclado.nextInt();
            contadorTotal=contadorTotal+1;
            if(edad>=18){
                contadorMayores=contadorMayores+1;
                acumuladorMayores=acumuladorMayores+edad;
            }
            System.out.println("Desea ingresar registros s/n");
        }
        promedioMayores=acumuladorMayores/contadorMayores;
        System.out.println("Promedio de los mayores de edad: "+promedioMayores);
        System.out.println("Numero de personas mayores de edad "+contadorMayores);
        System.out.println("Numero total que ingresaron "+contadorTotal);
            

    }
    
}
