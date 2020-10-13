import java.util.Scanner;

public class Ciclo5 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
      int aprob=0, numest=0, cont=0, repro=0, mayor=0, menor=0;
      double cal=0, i=1, preprob=0, suma=0,promedio=0;
      String name;
    
        System.out.println("INGRESE EL NUMERO DE ESTUDIANTES");
    numest=teclado.nextInt();
    while(i<=numest){
        System.out.println("INGRESE EL NOMBRE");
        name=teclado.next();
        System.out.println("INGRESE LA CALIFICACION DEL ESTUDIANTE");
        cal=teclado.nextDouble();
        if (cal>=3 && cal<=5){
            aprob++;
        }
        else {
            repro++;
        }
        suma=(suma+cal);
        if (cont==0){
            
        
        mayor=(int)cal;
        menor=(int)cal;                              
        }
        else {
             if (cal > mayor){
                    mayor=(int)cal;
                }
             else{
                        if (cal < menor){
                        menor=(int)cal;
                }       
                  }
              }
        
        cont=cont+1;
        i++;
    }
        
    promedio=suma/numest;
    preprob=repro/numest*100;
    
        System.out.println("LA CANTIDAD DE ESTUDIANTES APROBADOS SON "+aprob);
        System.out.println("LA CANTIDAD DE ESTUDIANTES REPROBADOS SON "+repro);
        System.out.println("EL PORCENTAJE DE ESTUDIANTES REPROBADOS ES "+preprob+" %");
        System.out.println("LA NOTA MAS ALTA "+mayor);
        System.out.println("\"LA NOTA MAS BAJA"+menor);
        System.out.println("\"EL PROMEDIO ES DE "+promedio);
       
 }
}
