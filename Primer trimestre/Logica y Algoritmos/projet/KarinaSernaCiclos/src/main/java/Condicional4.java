
import java.util.Scanner;


public class Condicional4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int preciou;
        double peso;
        
        System.out.println("INGRESE EL PESO DE LAS MANZANAS");
        peso=teclado.nextDouble();
        System.out.println("INGRESE PRECIO POR KILO");
        preciou=teclado.nextInt();
        
        if(peso>=0.00 && peso<=2.00){
            System.out.println("EL PRECIO TOTAL A PAGAR ES "+(preciou*peso));
        }
        if(peso>=2.01 && peso<=5.00){
            System.out.println("EL PRECIO TOTAL A PAGAR ES "+(preciou*peso*0.90));
        }
        if(peso>=5.01 && peso<10.00){
        System.out.println("EL PRECIO TOTAL A PAGAR ES "+(preciou*peso*0.85)); 
        }
        if(peso>10.01){
        System.out.println("EL PRECIO TOTAL A PAGAR ES "+(preciou*peso*0.80));
        }
    }
}
