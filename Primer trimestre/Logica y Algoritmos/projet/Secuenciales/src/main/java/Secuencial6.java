
import java.util.Scanner;


public class Secuencial6 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        
        String empleado1,empleado2,empleado3;
        double salario1,salario2,salario3,total1,total2,total3,aumento1,aumento2,aumento3;
        
        System.out.println("INGRESE NOMBRE DEL PRIMER EMPLEADO");
        empleado1=teclado.next();
        System.out.println("INGRESE SU SALARIO RESPECTIVO");
        salario1=teclado.nextDouble();
        System.out.println("IGRESE EL SEGUNDO NOMBRE DEL EMPLEADO");
        empleado2=teclado.next();
        System.out.println("INGRESE SU SALARIO RESPECTIVO");
        salario2=teclado.nextDouble();
        System.out.println("INGRESE EL NOMBRE DEL TERCER EMPLEADO");
        empleado3=teclado.next();
        System.out.println("INGRESE SU SALARIO RESPECTIVO");
        salario3=teclado.nextDouble();
        
        aumento1=(double)salario1*0.10;
        aumento2=(double)salario2*0.12;
        aumento3=(double)salario3*0.15;
        
        total1=(double)(salario1+aumento1);
        total2=(double)(salario2+aumento2);
        total3=(double)(salario3+aumento3);
        
        System.out.println("el empleado "+empleado1 + " tiene un salario de "+total1);
        System.out.println("el empleado "+empleado2 + " tiene un salario de "+total2);
        System.out.println("el empleado "+empleado3 + " tiene un salario de "+total3);
        
        
        
    }
    
}
