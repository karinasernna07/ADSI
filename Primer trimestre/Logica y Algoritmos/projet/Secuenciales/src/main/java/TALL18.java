import java.util.Scanner;

public class TALL18 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int muj, hom, salon;
        double  pmuj, phom;
        
                
        System.out.println("Ingrese el numero de mujeres del salon");
        muj=teclado.nextInt();
        System.out.println("Ingrese el numero de hombres del salon");
        hom=teclado.nextInt();
        
        salon=(int) muj+hom;
        pmuj=(double) muj/salon*100;
        phom=(double) hom/salon*100;
       
                      
        System.out.println("EL PORCENTAJE DE MUJERES EN EL SALON ES DE "+pmuj+"%");
        System.out.println("EL PORCENTAJE DE HOMBRES EN EL SALON ES DE "+phom+"%");       
   }
    
}
