
import java.util.Scanner;


public class Multiplos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int i,n,numero,contador=0;
        double acumMultiplo=0,promedio,acumTotal=0;
        
        System.out.println("ingrese N numeros");
        n=teclado.nextInt();
        for (i = 1; i <=n; i++){
            System.out.println("ingrese el numero");
            numero=teclado.nextInt();
            acumTotal=acumTotal+1;
            if(numero%2==0){
                acumMultiplo=acumMultiplo+numero;
            }
            if(numero%5==0 && numero%7==0){
                contador=contador+1;
            }
        }
        promedio=acumTotal/n;
        System.out.println("la suma de los multiplos de 2 es: "+acumMultiplo);
        System.out.println("total de numeros multiplos de 5 y de 7: "+contador);
        System.out.println("el promedio total de todos los numeros es: "+promedio);
    }
    
}
