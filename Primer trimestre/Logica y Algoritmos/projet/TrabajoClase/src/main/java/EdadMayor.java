
import java.util.Scanner;


public class EdadMayor {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int n,edad,auxEdadMayor=0;
        String nombre,auxNombre="";
        
        System.out.println("ingresar el dato del individuo");
        n=teclado.nextInt();
        for (int i =1 ; i <=n; i++) {
            System.out.println("ingrese nombre");
            nombre=teclado.next();
            System.out.println("ingrese la edad");
            edad=teclado.nextInt();
            if(edad>auxEdadMayor){
                auxEdadMayor=edad;
                auxNombre=nombre;
            }
        }
        System.out.println("Datos de la persona mayor");
        System.out.println("nombre "+auxNombre+ " Edad "+auxEdadMayor);
        
    }
    
}
