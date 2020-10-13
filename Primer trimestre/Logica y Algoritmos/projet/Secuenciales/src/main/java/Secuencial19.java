import java.util.Scanner;

public class Secuencial19 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        String pinversionista,sinversionista,tinversionista;
        
        double pvalor,svalor,tvalor, total,porcentaje;
        
        System.out.println(" ingrese el primer nombre del inversionista");
        pinversionista=teclado.next();
        
        System.out.println(" ingrese el valor a invertir a la empresa");
        pvalor=teclado.nextDouble();
        
        System.out.println("ingrese el nombre del segundo inversionista");
        sinversionista=teclado.next();
        System.out.println(" ingrese el valor a invertir");
        svalor=teclado.nextDouble();
        
        System.out.println("ingrese el nombre del tercer inversionista");
        tinversionista=teclado.next();
        
        System.out.println(" ingrese el valor a invertir");
        tvalor=teclado.nextDouble();
        
        total=(pvalor+svalor+tvalor);
        
               
        System.out.println(" el total de inversion es :"+total);
        
        porcentaje=pvalor+svalor+tvalor/3;
        System.out.println(" el inversionista: " +pinversionista+ " tienen una inversion de: "+pvalor/total*100+"%");
        System.out.println(" el inversionista: "+sinversionista+ " tiene una inversion de: "+svalor/total*100+"%");
        System.out.println(" el invesionista: " +tinversionista+ "tiene una inversion de: "+tvalor/total*100+"%");
    }
}

