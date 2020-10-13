
import java.util.Scanner;

/*
almacenar los elementos de una matriz de 4x4 (numeros enteros positivos)
imprimir la fila que contiene el numero menor y la columna que tenga el numero
mayor
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        final int filas = 4, columna= 4;
        int  mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;
        
        int[][] matriz = new int [filas][columna];
        

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <columna; j++) {
                System.out.println("Ingrese valores a la matriz ");
                matriz[i][j]=teclado.nextInt();
                
            }
            
        }
        System.out.println(" ");
        System.out.println("Valores introducidos en la matriz ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
            
        }
        mayor=menor=matriz[0][0];
        filaMayor = filaMenor = colMayor = colMenor=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                    filaMayor=i;
                    colMayor=j;
                } else {
                    if(matriz[i][j]<menor){
                        menor=matriz[i][j];
                        filaMenor=i;
                        colMenor=j;
                    }
                }
                
            }
            
        }
        System.out.println(" ");
        System.out.println("el numero mayor es "+mayor);
        System.out.println("fila; " +filaMayor+ " columna " +colMayor);
        System.out.println("el numero menor es " +menor);
        System.out.println("fila: "+filaMenor+ " columna "+colMenor);
    }
}
