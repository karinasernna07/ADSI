
import java.util.Scanner;

/*
VECTOR PARALELO: Decimos que el valor X es paralelo al vector Y
si en la componente 0 de cada vector se almacena información relacionada
EJEMPLO: (Juan - 12 años)

Ejemplo:
Desarrollar un programa que permita cargar 5 nombres de personas
y sus edades respectivas. Luego de realizar la carga por teclado
de todos los datos imprimir los nombres de las personas mayores 
de edad (mayores o iguales a 18 años)
USANDO METODOS
 */
public class Ejemplo7 {
    private Scanner teclado;
    
    private String[] nombre;
    private int[] edad;
    
    public void cargarDatos(){
        teclado = new Scanner (System.in);
        nombre = new String[5];
        edad = new int[5];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("ingrese el nombre");
            nombre[i]=teclado.next();
            System.out.println("Ingrese la edad");
            edad[i]=teclado.nextInt();
            
        }
    }
    public void mayorEdad(){
        System.out.println("Personas mayores de edad");
        for (int i = 0; i < nombre.length; i++) {
            if(edad[i]>=18){
                System.out.println(nombre[i]+" "+edad[i]+" años");
                
            }
            
        }
    }
    public static void main(String[] args) {
        Ejemplo7 objeto = new Ejemplo7();
        objeto.cargarDatos();
        objeto.mayorEdad();
    }
    
}
