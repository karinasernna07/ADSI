
import java.util.Scanner;


public class Condicional3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String codigo,nombre,estado;
        int nota;
        System.out.println("ingrese su nombre");
        nombre=teclado.next();
        System.out.println("ingrese su codigo");
        codigo=teclado.next();
        System.out.println("ingrese su nota");
        nota=teclado.nextInt();
        
        if (nota>=90){
            estado="excelente";
        }else {
            if(nota>=75){
                estado="aprobo";
                
            }else{
                estado="desaprovo";
            }
                
        }
        
        System.out.println("codigo "+codigo+ "nombre "+nombre+ "nota"+estado);
        
    }
}
