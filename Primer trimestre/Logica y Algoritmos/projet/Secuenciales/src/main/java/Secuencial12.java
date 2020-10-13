
import java.util.Scanner;


public class Secuencial12 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double varilla,uti,euros,nvarilla;
        
        System.out.println("INGRESE EL MONTO INVERTIDO");
        euros=teclado.nextDouble();
        
        varilla=(double) 6*2;
        nvarilla=(double) euros/varilla;
        uti=(double) euros*0.15;
        
        System.out.println("EL MONTO DE "+euros+"euros SE PODRA CONSTRUIR"+nvarilla);
        System.out.println("LA UTILIDAD ES DE "+uti+"euros");
        
    }
    
}
