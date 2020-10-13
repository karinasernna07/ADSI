
import java.util.Scanner;


public class ciclo5 {
    
  public static void main (String[]args) {
      
    int numero = 0;
    int ganaron_estudiantes = 0;
    int ganaron_bien = 0;
    int perdieron_estudiantes = 0;
    String nombres_estudianterebien = "";
    float nota_estudianterebien = 0;
    double promedionotas=0;
    int numero_estudiantesrebien=0;
    float nota_estudianteremal = 5;
    int numero_estudiantesremal=0;
    
    //Texto de presentacion
    System.out.println ("Bienvenido al sistema de computo de notas.");

    //Definicion del escaner
    Scanner lectura = new Scanner (System.in);

    //Parametros  de  control  en caso de error
    int okdata = 0;

    //Ciclo  de  validacion de datos
    while (okdata == 0) {
	//Uso  del try catch
	    try {
	        System.out.println ("Porfavor  ingrese el numero  de estudiantes:");
	        //lectura de numero de estudiantes
	        numero = Integer.parseInt (lectura.nextLine());
	        if (numero <= 0) {
	            System.out.println("El dato ingresado no es valido, numero de estudiastes debe ser superior a 0.");
	        } else {
	            okdata = 1;
	        } //Permite continuar al siguiente paso
	    } catch (Exception e) {
	        // En caso de error muestra  el texto
	        System.out.println ("El  dato ingresado no es valido.");
	        //Paso innesesario no cambia el valor y retorna al inicio
	        okdata = 0;		
	    }
    }

    //lectura de datos
    //Array de nombre de estudiantes
    String nombres_estudiantes[] = new String[numero];
    //Arrayrray  de notas
    float notas_estudiantes[] = new float[numero];

    for (int i = 0; i < numero; i = i + 1) {
        System.out.println ("Indique  el nombre de estudiante numero " + (i+1) + ":");
	    nombres_estudiantes[i] = lectura.nextLine();
	    okdata = 0;
	    //Ciclo  de  validacion de datos
	    while (okdata == 0) {
	    //Uso del try catch 
	    try {
	        System.out.println ("Indique  la nota del estudiante numero " + (i+1) + ":");
	        //lectura de la nota del estudiante
	        notas_estudiantes[i] = Float.parseFloat (lectura.nextLine ());
	        if (notas_estudiantes[i] >= 0 && notas_estudiantes[i] <= 5) {
	            //Permite  continuar al siguiente pso
		        okdata = 1;
                if (notas_estudiantes[i] >= 3) {
		            ganaron_estudiantes = ganaron_estudiantes + 1;
		            promedionotas=notas_estudiantes[i]+promedionotas;
                }
		    if(notas_estudiantes[i]<3) {
                perdieron_estudiantes = perdieron_estudiantes + 1;
		    }
		    if (notas_estudiantes[i] == 5) {
		        ganaron_bien = ganaron_bien + 1;
		    }
		    if (notas_estudiantes[i] == nota_estudianterebien) {
                numero_estudiantesrebien=numero_estudiantesrebien+1;
		        nombres_estudianterebien =nombres_estudianterebien + ", " + nombres_estudiantes[i];
		    } else {
		        if (notas_estudiantes[i] > nota_estudianterebien) {
			        nombres_estudianterebien = nombres_estudiantes[i];
			        nota_estudianterebien = notas_estudiantes[i];
			        numero_estudiantesrebien=1;
		        }
		    }
            if (notas_estudiantes[i] < nota_estudianteremal) {
                nota_estudianteremal = notas_estudiantes[i];
			    numero_estudiantesremal=1;
			}
		} else {
		    System.out.println ("La nota ingresada esta fuera del rango, porfavor ingrese una nota entre (0 y 5).");
		}} catch (Exception e) {
		    //En caso de error muestra  el texto
	        System.out.println ("El dato ingresado no es valido.");
	        //Paso innesesario no cambia el valor y  retorna al inicio
	        okdata = 0;
	    }
	  }
    }
    
    double porsentaje_perdido=(perdieron_estudiantes*100)/numero;
    promedionotas=promedionotas/ganaron_estudiantes;
    
    System.out.println("Numero de estudiantes que aprobaron el curso: " + ganaron_estudiantes + ".");
    System.out.println("El porcentaje de perdida en el curso es del: " + porsentaje_perdido + "%.");
    System.out.println("El promedio en notas de los estudiantes que aprobaron fue de +" + promedionotas + ".");
    System.out.println("Total de estudiantes con la nota mas alta: " + numero_estudiantesrebien + " : " + nombres_estudianterebien + ". con una nota de " + nota_estudianterebien + ".");
    
    if(nota_estudianterebien == 5) {
        System.out.println("Dichos estudiantes tambien alcanzaron la maxima nota.");
    } else {
        System.out.println("Ningun estudiante alcanzo la nota maxima.");
    }
    System.out.println(" ");
    System.out.println("La nota mas baja  fue de " + nota_estudianteremal + ".");
  }
}