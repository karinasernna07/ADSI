package Vectores;


public class Ejemplo5 {
    public static void main(String[] args) {
        int [] v1={25,60,80,100,23};
        int [] v2={20,10,50,40,75};
        int[] v3={v1.length+v2.length};
        
        //Almacenar en el v1 en el nuevo v3
        for (int i = 0; i < v1.length; i++) {
            v3[i]=v1[i];
            
        }
        //Almacenar en el v2 en el resto de estacio del v3
        for (int i = v2.length; i < v3.length; i++) {
            v3[i]=v2[i-v2.length];
            
        }
        //Imprimir el vector nuevo 
        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
            
        }
        
    }
    
}
