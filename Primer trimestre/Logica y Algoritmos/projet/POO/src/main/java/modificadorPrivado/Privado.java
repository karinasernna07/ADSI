/*
Private: los metodos o los miembros de datos declarados como privados solo son accesibles
dentro de la clase en la que se declaran
*/
package modificadorPrivado;

public class Privado {
    private void mostrar(){
        System.out.println("modificador Privado");
    }
    public static void main(String[] args) {
        Privado obj=new Privado();
        obj.mostrar();
    }
    
}
