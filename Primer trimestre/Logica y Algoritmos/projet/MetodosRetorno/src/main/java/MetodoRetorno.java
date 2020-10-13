
public class MetodoRetorno {
    public int sumar (int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    
    public int resta(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    
    public int multiplicacion (int numero1, int numero2){
        int multiplicar=numero1*numero2;
        return multiplicar;
    }
    
    public int division (int numero1, int numero2){
        int division=numero1/numero2;
        return division;
    }
    
    public void MostrarResultados (int suma, int resta, int multiplicar, int division){
        System.out.println("LA SUMA ES "+suma);
        System.out.println("LA RESTA ES "+resta);
        System.out.println("LA MULTIPLICACION ES "+multiplicar);
        System.out.println("LA DIVISION ES "+division);
    }
    

}
