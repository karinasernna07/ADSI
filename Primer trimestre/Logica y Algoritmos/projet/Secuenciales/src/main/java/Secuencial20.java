
import java.util.Scanner;


public class Secuencial20 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        
        int segt,mint,hort,horas,min,seg,segt2,segt3;
        
        System.out.println("INGRESE LA CANTIDD DE HORAS");
        horas=teclado.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE MINUTOS");
        min=teclado.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE SEGUNDOS");
        seg=teclado.nextInt();
        
        segt=(horas*3600)+(min*60)+seg;
        hort=segt/3600;
        segt2=segt-(hort*3600);
        mint=segt2/60;
        segt3=segt2-1*60;
        
        System.out.println("EN TOTAL "+hort+"hora");
        System.out.println("CON UNOS "+mint+"minutos");
        System.out.println("CON "+segt3+"segundos");
    }
    
}
