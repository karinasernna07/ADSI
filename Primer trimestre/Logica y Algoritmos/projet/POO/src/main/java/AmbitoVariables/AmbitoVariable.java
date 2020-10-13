
package AmbitoVariables;

public class AmbitoVariable {

    //variables globales
    static int variableStatica; //variable statica no requiere instanciar
    int variableGlobal;
    
    //Metodo
    public void metodo1(){
        //variable local
        int variablesLocal=10; //las variables locales es recomendable inicilizarlas
        System.out.println(variablesLocal);
        
    }
    
    public void metodo2(){
        System.out.println(variableStatica);
        System.out.println(variableGlobal);
    }
    
    public static void main(String[] args) {
        
        AmbitoVariable obt=new AmbitoVariable();
        obt.variableGlobal=9;
        
        //sin usar el objeto llamamos la varriable statica
        variableStatica=10;
    }
    
}
    

