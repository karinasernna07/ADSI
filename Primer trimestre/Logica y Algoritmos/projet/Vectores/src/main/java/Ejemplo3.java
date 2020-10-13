/*
Pasar el contenido de un vector entero a otro
 */
public class Ejemplo3 {
    public static void main(String[] args) {

        int vectorViejo [] = {30,90,70};
        //Declarar el otro vector donde va a quedar los elementos del vector anterior
        int vectorNuevo[] = new int [vectorViejo.length];
        
        //Pasar el vector antiguo al nuevo
        for (int i = 0; i < vectorViejo.length; i++) {
            vectorNuevo[i]=vectorViejo[i];
            
        }
        //Imprimir el vector nuevo
        for (int i = 0; i < vectorNuevo.length; i++) {
            System.out.println(vectorNuevo[i]);
            
        }
        
    }
    
}
