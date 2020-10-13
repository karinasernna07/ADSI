/*
Metodos.
Parametros: Es una declaracion de variables u objetos
Argumento: Es un valor que se envie
     *Declaracion del metodo
public void metodo(  parametros   ){
       INSTRUCCION
}
      *Invocacion del método
objeto.metodo(argumento);
*/
public class Parametroyargumentos {
    //Variable Globales
    int suma,resta,multiplicacion,division;
    
    //Metodo pra sumar dos números
    public void sumar (int numero1, int numero2){
        suma=numero1+numero2;
    }
    
    //Metodo para restar
    public void restar (int numero1, int numero2){
        resta=numero1-numero2;
    }
    
    //Metodo para multiplicar
    public void multiplicar (int numero1, int numero2){
        multiplicacion=numero1*numero2;
    }
    
    //Metodo para dividir
    public void division (int numero1, int numero2){
        division=numero1/numero2;
    }
    
    //Mostrar resultados
    public void mostrarResultados(){
        System.out.println("LA SUMA ES "+suma);
        System.out.println("LA RESTA ES "+resta);
        System.out.println("LA MULTIPLICACION ES "+multiplicacion);
        System.out.println("LA DIVISION ES "+division);
    }
    
}
