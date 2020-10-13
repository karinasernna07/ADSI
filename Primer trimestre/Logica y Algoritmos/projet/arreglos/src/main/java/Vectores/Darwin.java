package Vectores;

import java.util.Scanner;
import java.util.*;
public class Darwin
{
  public static void main (String[]args)
  {
    Scanner lectura = new Scanner (System.in);
    int h = 0;

    int opcion = 0;		//indicador del ejercicio

    int okdata = 0;		//verificador de segudirdad
    Boolean skip = false;	//  verificador de la opcion personalizada de algunos ejercicios
      System.out.println ("Bienvenido ");	// texto de presentacion
    while (okdata == 0)		//verificador en caso de falla
      {

	try
	{
	  System.out.println ("Seleccione el ejercicio");

	  opcion = Integer.parseInt (lectura.nextLine ());
	  if (opcion < 0 || opcion > 5)
	    {
	      System.out.println
		("El dato ingresado no es valido, numero de estudiastes debe ser superior a 0.");
	    }
	  else
	    {
	      okdata = 1;
	    }			//Permite continuar al siguiente paso
	}
	catch (Exception e)
	{
	  // En caso de error muestra  el texto
	  System.out.println ("El  dato ingresado no es valido.");
	  //Paso innesesario no cambia el valor y retorna al inicio
	  okdata = 0;
	}
      }
    switch (opcion)		//switch de  opciones del ejercicio
      {

	//ejecicio 1
      case 1:


	okdata = 0;		//reinicio del verificador
	int numero_notas = 0;	//numero de notas a promediar
	float sumnotas = 0;	//sumatoria de la s notas
	while (okdata == 0)
	  {

	    try
	    {

	      System.
		out.println ("Indique  el  numero  de notas a promediar" +
			     "" + ":");

	      numero_notas = Integer.parseInt (lectura.nextLine ());	//captura y transformacion  de los datos 
	      if (numero_notas < 0)
		{
		  System.out.println ("El dato ingresado no es valido, numero de notas debe ser superior a 0.");	//en caos de numero negativo
		}
	      else
		{
		  okdata = 1;
		}		//Permite continuar al siguiente paso
	    }
	    catch (Exception e)
	    {
	      // En caso de error muestra  el texto
	      System.out.println ("El  dato ingresado no es valido.");
	      //Paso innesesario no cambia el valor y retorna al inicio
	      okdata = 0;
	    }
	  }

	float notas_cursos[] = new float[numero_notas];	//vector que almasenara las notas
	for (int i = 0; i < numero_notas; i = i + 1)
	  {
	    okdata = 0;
	    //Ciclo  de  validacion de datos
	    while (okdata == 0)
	      {
		//Uso del try catch 
		try
		{
		  System.out.println ("Indique  la nota numero " + (i + 1) +
				      ":");
		  //lectura de la nota del estudiante

		  if (notas_cursos[i] >= 0 && notas_cursos[i] <= 5)


		    {
		      notas_cursos[i] =
			Float.parseFloat (lectura.nextLine ());
		      okdata = 1;


		    }
		  else
		    {

		      System.out.println
			("nota fuera de rango profavor notas entre 0 y 5 ");
		    }

		}
		catch (Exception e)
		{
		  //En caso de error muestra  el texto
		  System.out.println ("El dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y  retorna al inicio
		  okdata = 0;
		}
	      }
	  }
	//calculo del promedio
	for (int i = 0; i < numero_notas; i = i + 1)
	  {
	    sumnotas = notas_cursos[i] + sumnotas;
	  }
	sumnotas = sumnotas / numero_notas;
//imprecion notas
	System.out.println ("el promedio de las notas  ingresadas es:" +
			    sumnotas);

	break;
// ejercicio 2
      case 2:
	okdata = 0;
	int numero_datos = 0;	//numero de datos a calificar
	while (okdata == 0)	// verificador
	  {

	    try
	    {

	      System.out.println ("Indique  el  numero  de datos a ordenar" +
				  "");
	      System.out.println
		(": si seleciona el numero entero  -1 u el numero de notas por defecto sera 10");

	      numero_datos = Integer.parseInt (lectura.nextLine ());	//captura y  convercion de datos a datos numericos
	      if (numero_datos < 0 && numero_datos != -1)
		{
		  System.out.println
		    ("El dato ingresado no es valido, numero de notas debe ser superior a 0.");

		}
	      else
		{
		  if (numero_datos == -1)	//valor por defecto  en caso de opcion de 10 datos
		    {
		      numero_datos = 10;
		    }

		  okdata = 1;
		}		//Permite continuar al siguiente paso
	    }
	    catch (Exception e)
	    {
	      // En caso de error muestra  el texto
	      System.out.println ("El  dato ingresado no es valido.");
	      //Paso innesesario no cambia el valor y retorna al inicio
	      okdata = 0;
	    }
	  }

	int datos_ordenar[] = new int[numero_datos];	//vector  que almasena lso datos a ordenar
	for (int i = 0; i < numero_datos; i = i + 1)
	  {
	    okdata = 0;
	    //Ciclo  de  validacion de datos
	    while (okdata == 0)
	      {
		//Uso del try catch 
		try
		{
		  System.out.println ("Indique  el dato numero " + (i + 1) +
				      ":");
		  //lectura de la nota del estudiante


		  datos_ordenar[i] = Integer.parseInt (lectura.nextLine ());
		  okdata = 1;




		}
		catch (Exception e)
		{
		  //En caso de error muestra  el texto
		  System.out.println ("El dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y  retorna al inicio
		  okdata = 0;
		}
	      }
	  }
	System.out.println ("el vector con los datos");
	for (int i = 0; i < numero_datos; i = i + 1)
	  {
	    System.out.println (datos_ordenar[i]);
	  }
	//metodo burbuja
	for (int i = 0; i < numero_datos; i = i + 1)
	  {
	    for (int j = 0; j < numero_datos - i - 1; j = j + 1)
	      {
		if (datos_ordenar[j] > datos_ordenar[j + 1])
		  {

		    int cambio = datos_ordenar[j];
		    datos_ordenar[j] = datos_ordenar[j + 1];
		    datos_ordenar[j + 1] = cambio;
		  }




	      }
	  }


	System.out.println ("quedaria ordenado de la siguiente forma");
	for (int i = 0; i < numero_datos; i = i + 1)	//imprecion de los datos  ordenados 
	  {
	    System.out.println (datos_ordenar[i]);
	  }



	break;

	//ejercicio 3
      case 3:

	okdata = 0;
	int fila_matriz = 0;	//numero de filas de la matriz
	int columnas_matriz = 0;	//numero de filas//numero de columnas de la matriz
	skip = false;
	int numero_menor = Integer.MAX_VALUE;	//VALOR MAXIMO se usa el maximo valor para dejar  que el numero sea el maximo
	int numero_mayor = Integer.MIN_VALUE;	//VALOR MINIMO se usa el minimo valor para que el primer valor capturado sea el minimo


	final double THRESHOLD = .0001;	// dada la naturaleza de el tipo de dato  double  se usa un valor  bajo  para poder realizar comparaciones 
	while (okdata == 0)	//comienso de la verificacion
	  {

	    try
	    {

	      System.out.println
		("desea trabajar  con una matriz 4x4  (si) o establecer el tamaC1o de la matriz(no)");


	      String decision = lectura.nextLine ();

	      if (decision.equals ("si"))

		{


		  fila_matriz = 4;
		  columnas_matriz = 4;
		  skip = true;

		  okdata = 1;
		}
	      else
		{
		  if (decision.equals ("no"))
		    {
		      System.out.println
			("se procedera con el cambio manual");
		      okdata = 1;

		    }
		  else
		    {
		      System.out.println ("dato incorrecto");
		      okdata = 0;
		    }

		}		//Permite continuar al siguiente paso
	    }
	    catch (Exception e)
	    {
	      // En caso de error muestra  el texto
	      System.out.println ("El  dato ingresado no es valido.");
	      //Paso innesesario no cambia el valor y retorna al inicio
	      okdata = 0;
	    }
	  }


	if (skip == false)	//esta parte se puede quitar es en caso de que se quiera una matriz  de dimenciones distintas a 4*4
	  {
	    okdata = 0;
	    while (okdata == 0)
	      {

		try
		{

		  System.out.println ("Indique  el  numero  de columnas" +
				      "");

		  columnas_matriz = Integer.parseInt (lectura.nextLine ());
		  if (columnas_matriz < 0)
		    {
		      System.out.println
			("El dato ingresado no es valido, numero de notas debe ser superior a 0.");

		    }
		  else
		    {


		      okdata = 1;
		    }		//Permite continuar al siguiente paso
		}
		catch (Exception e)
		{
		  // En caso de error muestra  el texto
		  System.out.println ("El  dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y retorna al inicio
		  okdata = 0;
		}
	      }

	    okdata = 0;
	    while (okdata == 0)
	      {

		try
		{

		  System.out.println ("Indique  el  numero  de columnas" +
				      "");

		  fila_matriz = Integer.parseInt (lectura.nextLine ());
		  if (fila_matriz < 0)
		    {
		      System.out.println
			("El dato ingresado no es valido, numero de notas debe ser superior a 0.");

		    }
		  else
		    {


		      okdata = 1;
		    }		//Permite continuar al siguiente paso
		}
		catch (Exception e)
		{
		  // En caso de error muestra  el texto
		  System.out.println ("El  dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y retorna al inicio
		  okdata = 0;
		}
	      }

	  }
	int columnas_mayores[] = new int[fila_matriz];
	int filas_menores[] = new int[columnas_matriz];
	int matriz[][] = new int[fila_matriz][columnas_matriz];
	for (int i = 0; i < fila_matriz; i = i + 1)
	  {
	    for (int j = 0; j < columnas_matriz; j = j + 1)
	      {
		okdata = 0;
		//Ciclo  de  validacion de datos
		while (okdata == 0)
		  {
		    //Uso del try catch 
		    try
		    {
		      System.out.
			println ("Indique  el dato   en la pocicion :(" +
				 (i + 1) + "," + (j + 1) + ")");




		      matriz[i][j] = Integer.parseInt(lectura.nextLine ());
		      System.out.println (matriz[i][j]);
		     
		   
		    
			  if (matriz[i][j] < numero_menor)
			    {

			      numero_menor = matriz[i][j];
			      
			      filas_menores[0] = i;
			    }
			

		   
		     
			  if (matriz[i][j] > numero_mayor)
			    {

			      numero_mayor = matriz[i][j];
			      
			      columnas_mayores[0]=j;

			    }
			

		      okdata = 1;




		    }
		    catch (Exception e)
		    {
		      //En caso de error muestra  el texto
		      System.out.println ("El dato ingresado no es valido.");
		      //Paso innesesario no cambia el valor y  retorna al inicio
		      okdata = 0;
		    }
		  }
	      }
	  }
	System.out.println ("la fila con almenos uno de los  numeros mas  es la siguiente");
	for (int i = 0; i < columnas_matriz; i = i + 1)
	  {
	    System.out.println (matriz[filas_menores[0]][i]);
	  }
	  
	  System.out.println ("la columna con almenos uno de los numeros mas altos es la siguinete");
	for (int i = 0; i <fila_matriz; i = i + 1)
	  {
	    System.out.println (matriz[i][columnas_mayores[0]]);
	  }


	break;

	//ejercicio 4 
      case 4:
	String printmatriz = " ";

	h = 0;
	okdata = 0;
	int f_matriz = 0;	//numero de filas
	int c_matriz = 0;	// numero de columnas
	skip = false;		//controlador de pregunta  de  matriz default  o personalizada
	while (okdata == 0)	// verificador de seguridad para evitar crasheos  o datos incorrectos
	  {

	    try
	    {

	      System.out.println
		("desea trabajar  con una matriz 5x5  (si) o establecer el tamaC1o de la matriz(no)");


	      String decision = lectura.nextLine ();

	      if (decision.equals ("si"))

		{


		  f_matriz = 5;
		  c_matriz = 5;
		  skip = true;

		  okdata = 1;
		}
	      else
		{
		  if (decision.equals ("no"))
		    {
		      System.out.println
			("se procedera con el cambio manual");
		      okdata = 1;

		    }
		  else
		    {
		      System.out.println ("dato incorrecto");
		      okdata = 0;
		    }

		}		//Permite continuar al siguiente paso
	    }
	    catch (Exception e)
	    {
	      // En caso de error muestra  el texto
	      System.out.println ("El  dato ingresado no es valido.");
	      //Paso innesesario no cambia el valor y retorna al inicio
	      okdata = 0;
	    }
	  }
//esta parte lo peuden quitar es en caso de que se quiera una matriz  de dimenciones  a 5*5 solamente

	if (skip == false)
	  {
	    okdata = 0;
	    while (okdata == 0)
	      {

		try
		{

		  System.out.println ("Indique  el  numero  de columnas" +
				      "");

		  c_matriz = Integer.parseInt (lectura.nextLine ());
		  if (c_matriz < 0)
		    {
		      System.out.println
			("El dato ingresado no es valido, numero de notas debe ser superior a 0.");

		    }
		  else
		    {


		      okdata = 1;
		    }		//Permite continuar al siguiente paso
		}
		catch (Exception e)
		{
		  // En caso de error muestra  el texto
		  System.out.println ("El  dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y retorna al inicio
		  okdata = 0;
		}
	      }

	    okdata = 0;
	    while (okdata == 0)
	      {

		try
		{

		  System.out.println ("Indique  el  numero  de filas" + "");

		  f_matriz = Integer.parseInt (lectura.nextLine ());
		  if (f_matriz < 0)
		    {
		      System.out.println
			("El dato ingresado no es valido, numero de notas debe ser superior a 0.");

		    }
		  else
		    {


		      okdata = 1;
		    }		//Permite continuar al siguiente paso
		}
		catch (Exception e)
		{
		  // En caso de error muestra  el texto
		  System.out.println ("El  dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y retorna al inicio
		  okdata = 0;
		}
	      }

	  }
	okdata = 0;
	Double matriz2[][] = new Double[f_matriz][c_matriz];
	System.out.println (f_matriz);
// captura los datos
	for (int i = 0; i < f_matriz; i = i + 1)
	  {

	    for (int j = 0; j < c_matriz; j = j + 1)
	      {

		okdata = 0;
		//Ciclo  de  validacion de datos
		while (okdata == 0)
		  {

		    //Uso del try catch 
		    try
		    {
		      System.out.println ("Indique  el dato de la fila " +
					  (i + 1) + " columna " + (j + 1));
		      //lectura de la nota del estudiante


		      matriz2[i][j] =
			Double.parseDouble (lectura.nextLine ());
		      okdata = 1;




		    }
		    catch (Exception e)
		    {
		      //En caso de error muestra  el texto
		      System.out.println ("El dato ingresado no es valido.");
		      //Paso innesesario no cambia el valor y  retorna al inicio
		      okdata = 0;
		    }
		  }
	      }
	  }


//imprime la matriz como en el caso de el codigo  que impirme el resultado a este se le pueden quitar esas lineas de codigo si nose prefiere el decorado

	System.out.println ("la matriz");
	printmatriz = "";

	h = 0;			//contador de la impresora

	for (int i = 0; i < f_matriz * 2; i = i + 1)
	  {
	    printmatriz = "";
	    //contador de la impresora
	    printmatriz = printmatriz + "|";
	    for (int j = 0; j < c_matriz; j = j + 1)
	      {
		if (i % 2 == 0)
		  {
		    printmatriz = printmatriz + "-" + "---";
		  }
		else
		  {
		    printmatriz =
		      printmatriz + "|" + String.valueOf (matriz2[h][j]);

		  }

	      }
	    System.out.println (printmatriz);
	    if (i % 2 != 0)	//contador cifras nuevas
	      {
		h = h + 1;
	      }
	  }
//metodo  burbuja
//metodo comun usado para ordenar sifras de forma relativamente eficiente (esencial)
	for (int i = 0; i < f_matriz; i = i + 1)
	  {
	    for (int j = 0; j < c_matriz; j = j + 1)
	      {
		for (int k = 0; k < c_matriz - j - 1; k = k + 1)
		  {
		    if (matriz2[i][k] > matriz2[i][k + 1])
		      {

			Double cambio2 = matriz2[i][k];
			matriz2[i][k] = matriz2[i][k + 1];
			matriz2[i][k + 1] = cambio2;
		      }




		  }
	      }
	  }
	System.out.println ("la matriz ordenada seria");
	printmatriz = "";

	h = 0;			//contador de la impresora

	for (int i = 0; i < f_matriz * 2; i = i + 1)	//en caso de querer eliminar  las lineas visuales basta con eleminar el *2 de f_matriz
	  // y dejar solamente las lineas que marcare con xxxx
	  {
	    printmatriz = "";	//xxxx
	    //contador de la impresora
	    printmatriz = printmatriz + "|";
	    for (int j = 0; j < c_matriz; j = j + 1)	//xxxx
	      {
		if (i % 2 == 0)
		  {
		    printmatriz = printmatriz + "-" + "---";	//crerador de lineas  visuales
		  }
		else
		  {
		    printmatriz =	//xxxx
		      printmatriz + "|" + String.valueOf (matriz2[h][j]);	// xxxx

		  }

	      }			//xxxx
	    System.out.println (printmatriz);	//xxxx
	    if (i % 2 != 0)	//contador cifras nuevas
	      {
		h = h + 1;
	      }
	  }
	break;


	///ejercicio 5
      case 5:
	h = 0;
	okdata = 0;
	int num_datos = 0;
	int MNPp = Integer.MIN_VALUE;	//MAYOR  NUMERO en pocicion par
	int PMNP = 0;		//POCICION DEL MAYOR NUMERO EN POCICION PAR
	int MNPi = Integer.MIN_VALUE;	//MAYOR NUMERO EN  POCICION IMPAR
	int sum_datos = 0;

	skip = false;		//controlador de pregunta  de  matriz default  o personalizada


	while (okdata == 0)	// verificador de seguridad para evitar crasheos  o datos incorrectos
	  {

	    try
	    {

	      System.out.println
		("desea trabajar  con un vector de 20  datos (si) o establecer el tamaC1o del vector(no)");


	      String decision = lectura.nextLine ();

	      if (decision.equals ("si"))

		{


		  num_datos = 20;

		  skip = true;

		  okdata = 1;
		}
	      else
		{
		  if (decision.equals ("no"))
		    {
		      System.out.println
			("se procedera con el cambio manual");
		      okdata = 1;

		    }
		  else
		    {
		      System.out.println ("dato incorrecto");
		      okdata = 0;
		    }

		}		//Permite continuar al siguiente paso
	    }
	    catch (Exception e)
	    {
	      // En caso de error muestra  el texto
	      System.out.println ("El  dato ingresado no es valido.");
	      //Paso innesesario no cambia el valor y retorna al inicio
	      okdata = 0;
	    }
	  }
//esta parte lo peuden quitar es en caso de que se quiera una matriz  de dimenciones  a 5*5 solamente

	if (skip == false)
	  {
	    okdata = 0;
	    while (okdata == 0)
	      {

		try
		{

		  System.out.println ("Indique  el  numero  datos" + "");

		  num_datos = Integer.parseInt (lectura.nextLine ());
		  if (num_datos < 0)
		    {
		      System.out.println
			("El dato ingresado no es valido, numero de datos debe ser superior a 0.");

		    }
		  else
		    {


		      okdata = 1;
		    }		//Permite continuar al siguiente paso
		}
		catch (Exception e)
		{
		  // En caso de error muestra  el texto
		  System.out.println ("El  dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y retorna al inicio
		  okdata = 0;
		}
	      }



	  }

	int[] vectordatos = new int[num_datos];
	for (int i = 0; i < num_datos; i = i + 1)
	  {

	    okdata = 0;
	    //Ciclo  de  validacion de datos
	    while (okdata == 0)
	      {

		//Uso del try catch 
		try
		{
		  System.out.println ("Indique  el dato numero " + (i + 1));
		  //lectura de la nota del estudiante


		  vectordatos[i] = Integer.parseInt (lectura.nextLine ());
		  if ((i+1)%2 == 0)	//%  SIGNIFICA  FACTORIAL y el factorial un numero par por 2 es 0
		    {
System.out.println (i + 1);
		      sum_datos = sum_datos + vectordatos[i];
		      System.out.println (sum_datos);
		      if (vectordatos[i] > MNPp)
			{
			  MNPp = vectordatos[i];
			  PMNP = i;

			}
		    }
		  else
		    {

		      if (vectordatos[i] > MNPi)
			{
			  MNPi = vectordatos[i];
			}

		    }

		  okdata = 1;




		}
		catch (Exception e)
		{
		  //En caso de error muestra  el texto
		  System.out.println ("El dato ingresado no es valido.");
		  //Paso innesesario no cambia el valor y  retorna al inicio
		  okdata = 0;
		}
	      }
	  }

	System.out.
	  println
	  ("la sumarotia  de los elementos en las pociciones pares del vector  es:"
	   + sum_datos);
	System.out.
	  println
	  ("el mayor de los elementos en las pociciones impares es el numero:"
	   + MNPi);
	System.out.
	  println
	  ("el  mayor elemento en las pociciones pares  se encuentra en la pocicion:"
	   + PMNP + " Y ES el numero:" + MNPp);
	   break;

      }
  }
}
