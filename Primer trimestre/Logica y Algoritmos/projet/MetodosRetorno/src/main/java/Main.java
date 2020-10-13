
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        MetodoRetorno objeto=new MetodoRetorno();
        int n1,n2;
        
        System.out.println("INGRESAR EL PRIMER NUMERO");
        n1=teclado.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        n2=teclado.nextInt();
        
        //primera forma crando variables que almacenen los contenidos de los metodos
       /* int sum=objeto.sumar(n1, n2);
        int res=objeto.resta(n1, n2);
        int mul=objeto.multiplicacion(n1, n2);
        int div=objeto.division(n1, n2);
        objeto.MostrarResultados(sum, res, mul, div);*/

        //segunda forma no requiere de MostrarResultados
        System.out.println("LA SUMA ES: "+ objeto.sumar(n1, n2));
        System.out.println("LA RESTA ES: "+ objeto.resta(n1, n2));
        System.out.println("LA MULTIPLICACION ES: "+ objeto.multiplicacion(n1, n2));
        System.out.println("LA DIVISION ES "+ objeto.division(n1, n2));
    }
}
