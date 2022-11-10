//Programa que, dados tres numeros enteros que representan una fecha (día, mes y año), determina si es válida.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, año;
		int feb; //Numero de dias de Febrero, si no es bisiesto es 28 y si es bisiesto es 29
		
		System.out.println("Introduce un dia");
		dia = sc.nextInt();
		System.out.println("Introduce un mes");
		mes = sc.nextInt();
		System.out.println("Introduce un año");
		año = sc.nextInt();
		
		System.out.println("Fecha introducida: " + dia + "/" + mes + "/" + año);
		
		//Para saber si es bisiesto
		if (año % 400 == 0)
			feb = 29; //bisiesto
		else if (año % 4 == 0 && año % 100 != 0)
			feb = 29; //bisiesto
		else
			feb = 28; //no bisiesto
		//Para saber si es bisiesto
		

			if( año > 0 && (((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31 ) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <=30)) || ((mes == 2) && (dia <= feb) ))

				System.out.println("La fecha es correcta");
		
			else
				System.out.println("La fecha es incorrecta");


	}//main

}//class
