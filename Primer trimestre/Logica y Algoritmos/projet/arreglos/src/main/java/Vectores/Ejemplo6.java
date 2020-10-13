package Vectores;

/*
Invertir un vector
*/
public class Ejemplo6 {
    public static void main(String[] args) {
        int vector []={20,60,80,90};
        int auxVector[] = new int[vector.length];
        int x=0; //Es para la posicion del vector
        
        for (int i = vector.length; i >= 0; i--) {
            auxVector[x]=vector[i];
            x++;
            
        }
        
    }
    
}
