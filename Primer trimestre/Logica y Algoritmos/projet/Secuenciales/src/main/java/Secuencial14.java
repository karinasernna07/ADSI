
import java.util.Scanner;


public class Secuencial14 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        String arti1,arti2,arti3;
        int cant1,cant2,cant3,uni1,uni2,uni3,total1,total2,total3;
        
        System.out.println("INGRESE SU PRIMER ARTICULO");
        arti1=teclado.next();
        System.out.println("INGRESE CANTIDAD A LLEVAR");
        cant1=teclado.nextInt();
        System.out.println("INGRESE SU VALOR POR UNIDAD");
        uni1=teclado.nextInt();
        
        System.out.println("INGRESE SU SEGUNDO ARTICULO");
        arti2=teclado.next();
        System.out.println("INGRESE CANTIDAD A LLEVAR");
        cant2=teclado.nextInt();
        System.out.println("INGRESE SU VALOR POR UNIDAD");
        uni2=teclado.nextInt();
        
        System.out.println("INGRESE SU TERCER ARTICULO");
        arti3=teclado.next();
        System.out.println("INGRESE CANTIDAD A LLEVAR");
        cant3=teclado.nextInt();
        System.out.println("INGRESE SU VALOR POR UNIDAD");
        uni3=teclado.nextInt();
        
        total1=cant1*uni1;
        total2=cant2*uni2;
        total3=cant3*uni3;
        System.out.println(" ARTICULO            CANTIDAD     PRECIO UNI    PRECIO TOTAL ");
        System.out.println("  "+arti1+"                "+cant1+"           "+uni1+"     "   +total1 );
        System.out.println("  "+arti2+"                "+cant2+"           "+uni2+"     "    +total2 );
        System.out.println("  "+arti3+"                "+cant3+"           "+uni3+"     "    +total3 );
         
        
        
    }
    
}
