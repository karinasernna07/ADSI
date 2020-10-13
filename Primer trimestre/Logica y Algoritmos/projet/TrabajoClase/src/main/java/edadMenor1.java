
import java.util.Scanner;


public class edadMenor1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int n,edad,auxEdadMedad=999999;
        
        System.out.println("ingrese cantidad de edades");
        n=teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingresar edad");
            edad=teclado.nextInt();
            
            if (edad<auxEdadMedad){
                auxEdadMedad=edad;
            }
            
        }
        
        System.out.println("edad menor "+auxEdadMedad);
    }
}
