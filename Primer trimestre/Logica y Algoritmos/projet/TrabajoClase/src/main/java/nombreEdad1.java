
public class nombreEdad1 {
    String nombre;
    int edad;
    
    public void nombre (String nombre1){
        nombre=nombre1;
        
    }
    public void edad (int edad1){
        edad=edad1;
        
        if (edad>=18){
            System.out.println("USTED ES MAYOR DE EDAD");
            
        }else{
            System.out.println("MENOR DE EDAD");
        }
        
    }
    public void MostrarResultados(){
        System.out.println("EL NOMBRE ES "+nombre);
        System.out.println("SU EDAD ES "+edad);
    }
}
