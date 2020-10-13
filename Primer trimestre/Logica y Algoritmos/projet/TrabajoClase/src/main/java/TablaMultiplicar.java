
import java.util.Scanner;


public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int num,mul;
        
        System.out.println("ingrese el numero que desee multiplicar");
        num=teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            mul=i*num;
            System.out.println(i+" X "+num+ " = "+mul);
            
        }
        
    }
}
