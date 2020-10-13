package Vectores;


import java.util.Scanner;

/*

 */
public class Ejemplo8 {
    private Scanner teclado;
    
    private String[] nombre;
    private double[] sueldo;
    
    public void cargar (){
        teclado = new Scanner (System.in);
        nombre = new String[5];
        sueldo = new double [5];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingresar el nombre del empleado");
            nombre[i]=teclado.next();
            System.out.println("Ingrese su sueldo");
            sueldo[i]=teclado.nextDouble();
            
        }
    }
    public void mayorSueldo(){
        double mayor;
        int pos;
        mayor=sueldo[0];
        pos=0;
        for (int i = 0; i < nombre.length; i++) {
            if(sueldo[i]>mayor){
                mayor=sueldo[i];
                pos=i;
            }
        }
        System.out.println("El empleado con el sueldo mayor es: "+nombre[pos]);
        System.out.println("tiene un sueldo de: "+mayor);
    }
    public static void main(String[] args) {
        Ejemplo8 obj = new Ejemplo8();
        obj.cargar();
        obj.mayorSueldo();
    }
    
}
