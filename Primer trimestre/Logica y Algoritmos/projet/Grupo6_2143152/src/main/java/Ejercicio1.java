/*
calcule el promedio de las calificaciones de las materias del trimestre,
utilizando un arreglo para almacenar todos las calificaciones y el promedio
guardelo en la siguiente posicion despues de la ultima calificación
*/
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double acumNota=0,promedio=0;
        int n;
        System.out.println("ingrese la cantidad de notas a promediar");
        n=teclado.nextInt();
        double [] nota=new double[n];
        
        for (int i = 0; i < nota.length; i++) {
            System.out.println("ingrese la nota "+(i+1));
            nota[i]=teclado.nextDouble();
            acumNota=acumNota+nota[i];
            
        }
        promedio=acumNota/nota.length;
        System.out.println("El promedio de las notas ingresadas es "+promedio);
        
        
    }
    
}
