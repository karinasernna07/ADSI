
import java.util.Scanner;

/*
ingresar N facturas
Leer valor de las facturas, numero de las facturas
Muestre el valor mayor de la factura con el numero de la factura correspondiente
Descuento del 3% del valor de la factura si est supera el valor de 1500000
averiguar el numero de factura que tuvieron descuentos 
sumar todas las facturs ingresadas
Promediar las facturas
*/
public class Ciclo6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int n,contFacDesc=0;
        String nFacturas,auxNumeroFactura="";
        double valorFactura,auxMayorValor=0,descuento,PORCENTAJE=0.03,totalDescuento;
        double acumTotalFacturas=0,promedio;
        
        System.out.println("INGRESE LA CANTIDAD DE FACTURAS");
        n=teclado.nextInt();
        
        for (int i = 0; i <=n; i++) {
            System.out.println("INGRESE EL N°FACTURA");
            nFacturas=teclado.next();
            System.out.println("INGRESE EL VALOR DE LA FACTURA");
            valorFactura=teclado.nextDouble();
            //proceso averiguar el valor mayor de las facturas
            if(valorFactura>auxMayorValor){
                auxMayorValor=valorFactura;
                auxNumeroFactura=nFacturas;
            }
            if (valorFactura>1500000){
                descuento=valorFactura*PORCENTAJE;
                totalDescuento=valorFactura-descuento;
                System.out.println("TOTAL CON DESCUENTO "+totalDescuento);
                contFacDesc=contFacDesc+1;
                
            }
            acumTotalFacturas=acumTotalFacturas+valorFactura;
        }
        promedio=acumTotalFacturas/n;
        System.out.println("EL VALOR MAYOR DE LA FACTURA ES "+auxMayorValor+" EL N° DE LA FACTURA ES "+auxNumeroFactura);
        System.out.println("CANTIDAD DE FACTURAS CON DESCUENTO "+contFacDesc);
        System.out.println("SUMA DE TODAS LAS FACTURAS "+acumTotalFacturas);
        System.out.println("EL PROMEDIO DE TODAS LAS FACTURAS "+promedio);
        
        
        
    }
}
