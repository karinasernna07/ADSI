
import java.util.Scanner;


public class Secuencial18 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int mujer,hombre,grupo;
        double tot1,tot2;
        

        System.out.println("INGRESE CUANTAS MUJERES HAY EN EL GRUPO");
        mujer=teclado.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE HOMBRE QUE HAY EN EL GRUPO");
        hombre=teclado.nextInt();
        
        grupo=(int)mujer+hombre;
        tot1=(double) (mujer/grupo)*100;
        tot2=(double) (hombre/grupo)*100;
        
        
        System.out.println("EL PORCENTAJE DE MUJERES ES: "+tot1);
        System.out.println("EL PORCENTAJE DE HOMBRES ES: "+tot2);
        
    }
    
}
