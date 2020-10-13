
import java.util.Scanner;


public class MainNombre {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        nombreEdad1 objeto=new nombreEdad1();
        
        String nombre;
        int edad;
        
        System.out.println("INGRESE SU NOMBRE");
        nombre=teclado.next();
        System.out.println("INGRESE SU EDAD");
        edad=teclado.nextInt();
        
        objeto.nombre (nombre);
        objeto.edad (edad);
        
    }
}
