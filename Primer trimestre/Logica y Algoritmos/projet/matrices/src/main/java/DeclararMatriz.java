
import java.util.Scanner;


public class DeclararMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //Crear Matriz de 3x2
        int [][] matriz=new int [3][2];
        
        //Llenar la matriz
        matriz[0][0]=16;
        matriz[0][1]=12;
        
        matriz[1][0]=16;
        matriz[1][1]=20;
        
        matriz[2][0]=50;
        matriz[2][1]=30;
        
       // System.out.println(matriz[1][1]);
       
       //Crear matriz y llenarla en una sola linea
       int[][] matriz1 = {{20,50},{30,12},{60,80}};
       
        System.out.println("tamaño de la fila");
        System.out.println(matriz1.length);
        
        System.out.println("*************************");
        System.out.println("Tamaño de la calumna");
        System.out.println(matriz1[0].length);
        
        //Recorrer la matriz. Imprimir
        System.out.println("**************************");
        double suma=0;
        for (int i = 0; i < matriz1.length; i++) //Este ciclo controla las filas
        {
            System.out.println("");

            for (int j = 0; j < matriz1[i].length; j++) //Este ciclo controla las columnas
            {
                System.out.print(matriz1[i][j]+" ");
                suma=suma+matriz1[i][j];
            }
            
        }
        System.out.println("");
        System.out.println("La suma de la matriz es "+suma);
        
        //Listar la primera fila 
        System.out.println("");
        System.out.println("Listar la primera fila");
        for (int i = 0; i < matriz1[0].length; i++) {
            System.out.println(matriz1[0][i]);
            
        }
        //Listar la primera columna
        System.out.println("");
        System.out.println("Listar la primera columna");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println(matriz1[i][0]);
            
        }
        //Listar la segunda fila
        System.out.println("");
        System.out.println("Listar la segunda fila");
        for (int i = 0; i < matriz1[1].length; i++) {
            System.out.println(matriz1[1][i]);
            
        }
        //Listar Segunda Columna
        System.out.println("");
        System.out.println("Listar la segunda columna");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println(matriz1[i][1]);
            
        }
        //Listar la tercera fila
        System.out.println("");
        System.out.println("Listar la tercera fila");
        for (int i = 0; i < matriz1[2].length; i++) {
            System.out.println(matriz1[2][i]);
            
        }
        //Sumar la Primera Fila
        System.out.println("");
        System.out.println("Sumar la primra fila");
        for (int i = 0; i < matriz1.length; i++) {
         suma=suma+matriz1[0][i];
            
        }
        System.out.println("");
        System.out.println("La Suma de la fila es "+suma);
        
    }
}
