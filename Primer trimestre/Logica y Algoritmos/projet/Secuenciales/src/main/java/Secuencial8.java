
import java.util.Scanner;


public class Secuencial8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        double n1,n2,n3,n4,suma,promedio;
        
        System.out.println("INGRESE SU PRIMER NUMERO");
        n1=teclado.nextDouble();
        System.out.println("INGRESE SU SEGUNDO NUMERO");
        n2=teclado.nextDouble();
        System.out.println("INGRESE SU TERCER NUMERO");
        n3=teclado.nextDouble();
        System.out.println("INGRESE SU CUARTO NUMERO");
        n4=teclado.nextDouble();
        
        suma=n1+n2+n3+n4;
        promedio=suma/4;
        
        System.out.println("ES RESULTADO DE LA SUMA "+suma+ "EL PROMEDIO DE SU SUMA ES: "+promedio);
        
    }
    
}
