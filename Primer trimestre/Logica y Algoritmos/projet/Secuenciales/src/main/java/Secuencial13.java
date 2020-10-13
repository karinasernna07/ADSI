
import java.util.Scanner;


public class Secuencial13 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        
        String nombre;
        double total, salario,total1,total2,tbonificacion;
        
        System.out.println("INGRESE SU NOMBRE");
        nombre=teclado.next();
        System.out.println("INGRESE SU SALARIO");
        salario=teclado.nextDouble();
        
        total=salario*0.10;
        total2=salario*0.02;
        tbonificacion=(salario+total)-total2;
        
        System.out.println("EL EMPLEADO "+nombre+ " TIENE UN  SUELDO MENSUAL DE "+tbonificacion);
        
    }
    
}
