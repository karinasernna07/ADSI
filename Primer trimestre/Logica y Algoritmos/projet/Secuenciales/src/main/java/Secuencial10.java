
import java.util.Scanner;


public class Secuencial10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int costotal,costo,ganancia,impuesto;
        
        System.out.println("INGRESE EL VALOR COMERCIAL DEL VEHICULO");
        costo=teclado.nextInt();
        
        ganancia=(int) (costo*0.01);
        impuesto=(int) (costo*0.06);
        costotal=(int) (costo-(impuesto+ganancia));
        
        System.out.println("EL VALOR TOTAL DEL VEHICULO ES "+costotal);
        System.out.println("EL IMPUESTO DEL VEHICULO ES DE "+impuesto);
        System.out.println("LA GANACIA GENERADA POR EL VEHICULO ES DE "+ganancia);
        
    }
    
}
