package Vectores;

/*
Metodo Burbuja
 */
public class Ejemplo9 {
    public static void main(String[] args) {
        
        int numero[]= {25,9,5,78};
        int i,j,aux;
        
        for (int k = 0; k < numero.length; k++) {
            for (int l = 0; l < numero.length-k-1; l++) {
                if(numero[l+1]<numero[l]){
                    aux=numero[l+1];
                    numero [l+1]=numero[l];
                    numero[l]=aux;
                }
                
            }
            
        }
        for (int k = 0; k < numero.length; k++) {
            System.out.println(numero[k]);
            
        }
    }
    
}
