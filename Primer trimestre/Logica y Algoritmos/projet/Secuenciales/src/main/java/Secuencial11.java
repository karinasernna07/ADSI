
import java.util.Scanner;


public class Secuencial11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double tiempo1,tiempo2,tiempo3,promedio;
        
        System.out.println("INGRESE SU TIEMPO DEL DIA LUNES");
        tiempo1=teclado.nextDouble();
        System.out.println("INGRESE EL TIEMPO DEL DIA MIERCOLES");
        tiempo2=teclado.nextDouble();
        System.out.println("INGRESE EL TIEMPO DEL DIA VIERNES");
        tiempo3=teclado.nextDouble();
        
        promedio=(tiempo1+tiempo2+tiempo3)/3;
        
        System.out.println("EL PROMEDIO DE SUS TIEMPOR POR SEMANA ES "+promedio);
        
    }
    
}
