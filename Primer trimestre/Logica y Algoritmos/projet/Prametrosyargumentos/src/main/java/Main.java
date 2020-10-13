
import java.util.Scanner;

/*

 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Parametroyargumentos objeto = new Parametroyargumentos ();
        int n1,n2;
        
        System.out.println("INGRESE EL PRIMER NUMERO");
        n1=teclado.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        n2=teclado.nextInt();
        
        //Invocar Metodos
        objeto.sumar(n1, n2);
        objeto.restar(n1, n2);
        objeto.multiplicar(n1, n2);
        objeto.division(n1, n2);
        objeto.mostrarResultados();
        
    }
}
