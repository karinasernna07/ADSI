
import java.util.Scanner;


public class Secuencial3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        String nombre;
        double nota1,nota2,nota3,promedio;
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre=teclado.next();
       
        System.out.println("ingrese primera nota");
        nota1=teclado.nextDouble();
        System.out.println("ingrese segunda nota");
        nota2=teclado.nextDouble();
        System.out.println("ingrese su tercera nota");
        nota3=teclado.nextDouble();
        
        promedio=(nota1+nota2+nota3)/3;
        
        System.out.println("el estudiante "+nombre + " tiene un promedio de  "+promedio);
        
        
    }
}
