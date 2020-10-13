package Vectores;

/*
   vector estructura de datos unidimennsional, almacena datos de tipo entero
 */


public class declaracionVectores {
    public static void main(String[] args) {
        //Declarar Vector
        int numero1[];
        
        //Crear tamaño al vector
        numero1=new int [4];
        
        //Declarar vector y tamaño en la misma linea
        int numero2[]=new int[4];
        
        //llenar el vector
        numero2[0]=1;
        numero2[1]=58;
        numero2[2]=60;
        numero2[3]=87;
        
        //imprimir el vector de la posicion 3
        System.out.println("EL VECTOR EN LA POSICION 3 ES "+ numero2[3]);
        
        System.out.println("*******************************************");
        System.out.println("Recorrido del vector 2");
        //Recorrer el vector
        for (int i = 0; i < 4; i++) {
            System.out.println(numero2[i]);
            
        }
        //Declarar otro vector, LLenarlo en la misma linea
        int[] numero3={20,80,50,60};
        System.out.println("********************************************");
        System.out.println("recorrido del vector 3");
        
        for (int i = 0; i < numero3.length; i++) {
            System.out.println(numero3[i]);
        }
        
        //otro vector. Crear un vector que contenga los numeros del 1-100
        
        System.out.println("******************************************");
        System.out.println("vector de numeros del 1-100");
        
        int [] numero4=new int [100];
        for (int i = 0; i < numero4.length; i++) {
            numero4[i]=i+1;
            System.out.println(numero4[i]);
            
        }
        
        //Sumar y promediar el vector 4
        System.out.println("******************************************");
        System.out.println("suma y promedio vector 4");
        double suma=0,promedio;
        for (int i = 0; i < numero4.length; i++) {
            numero4[i]=i+1;
            suma=suma+numero4[i];// Calculo de la suma acumulador
            
        }
        promedio=suma/numero4.length;
        System.out.println("LA SUMA DEL VECTOR ES "+suma);
        System.out.println("EL PROMEDIO DEL VECTOR ES "+promedio);
        
    }
            
}
