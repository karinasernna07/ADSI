
import java.util.Scanner;

//crear una matriz de 5x5, ordenarla por filas de menor a mayor numero.   mostrar la matriz

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
            int aux=0;
            int matriz [][] = new int [5][5];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Introduce un numero "+(i+1));
                    matriz[i][j]=teclado.nextInt();
                    
                }
        }
              for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    for (int r = 0; r < matriz.length; r++) {
                       for (int h = 0; h < matriz[i].length; h++) {
                            if(matriz[i][j]>=matriz[r][h]){
                             matriz[i][j]=matriz[i][j];
                        
                    }else{
                        aux=matriz[r][h];
                        matriz[r][h]=matriz[i][j];
                        matriz[i][j]=aux;
                        
                    }
                }
              }
            }
        }
              System.out.println("El orden de la matriz es ");
              for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                      System.out.print(matriz[i][j]+" ");
                      
                  }
                  System.out.println("");
            
        }
    }

}
