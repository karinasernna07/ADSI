
import java.util.Scanner;


public class Condicional2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        String nombre;
        double salario,descuento,sueldoNeto;
        double PORC1=0.10,PORC2=0.03,PORC3=0.05;
        
        System.out.println("INGRESE SU NOMBRE");
        nombre=teclado.next();
        System.out.println("INGRESE SU SALARIO");
        salario=teclado.nextDouble();
        
        if(salario>2000000){
            descuento=salario*PORC3;
            
         }else{
            if(salario>100000){
                descuento=salario*PORC2;
                
            }else{
                descuento=salario*PORC1;
            }
        }
        sueldoNeto=salario-descuento;
        System.out.println("nombre: "+nombre+ "su salario es: "+sueldoNeto);
        
    }
 
}
