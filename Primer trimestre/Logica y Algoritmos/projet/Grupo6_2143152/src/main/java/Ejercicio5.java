
 import java.util.Scanner;

public class Ejercicio5 {
    
      public static void main(String[] args) {
             Scanner teclado=new Scanner(System.in);
             
            int [] elemento=new int [20];
             int suma=0, mayor=0, pmay=0;
             
            for (int i = 0; i <elemento.length; i++) {
            System.out.println(" Ingrese el numero "+(i+1));
            elemento[i]=teclado.nextInt();
            }
             mayor=elemento[1];
             pmay=elemento[2];
                for (int j = 0; j <elemento.length; j++) {
                    if  ( j%2==0 && j!=0 ){
                        suma=elemento[j]+suma;
                    if (elemento[j]>=pmay){
                            pmay=elemento[j];
                        }

                    }
                        if( j%2 !=0 && j!=0){
                           
                        if (elemento[j]>=mayor){
                            mayor=elemento[j];
                        }
                    
                        }
                        
                    
                    
                }
            
                System.out.println(" la suma en las posiciones pares es: "+suma);
                System.out.println("el numero mayor que ocupa la posicion par es: "+mayor);  
                System.out.println("el numero mayor que ocupa la posicion impar es: "+pmay); 

    }
    
}