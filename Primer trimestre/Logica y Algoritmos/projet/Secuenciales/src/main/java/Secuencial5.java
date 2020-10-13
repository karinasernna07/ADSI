
import java.util.Scanner;


public class Secuencial5 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        
        double base,altura,total;
        
        System.out.println("INGRESE SU BASE");
        base=teclado.nextDouble();
        System.out.println("INGRESE LA ALTURA DEL TRIANGULO");
        altura=teclado.nextDouble();
        
        total= (double) (base*altura)/2;
        
        System.out.println("EL AREA DE SU TRIANGULO ES: "+total);
        
        
    }
}