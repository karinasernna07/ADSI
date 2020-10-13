
import java.util.Scanner;


public class Secuencial4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        
        String nombre;
        double horas,pagoHoras,salario;
        
        System.out.println("Ingrese el nombre del empleado");
        nombre=teclado.next();
        System.out.println("ingrese el nuemro de horas trabajadas");
        horas=teclado.nextDouble();
        System.out.println("ingrese el valor de la hora");
        pagoHoras=teclado.nextDouble();
        
        salario=horas*pagoHoras;
        
        System.out.println("el salario para el señor "+nombre+" es de "+salario+" pesos");

        
    }
    
}
