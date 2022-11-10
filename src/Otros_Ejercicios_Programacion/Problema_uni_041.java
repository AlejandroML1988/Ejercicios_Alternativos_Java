//Programa que determina si un año es bisiesto, esto es, si es divisible por 400 o bien
//si es divisible por 4 pero no por 100.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_041 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int año;
		
		System.out.println("Introduce un año");
		año = teclado.nextInt();
		System.out.println("El agno introducido es " + año);
		
		if (año % 400 == 0)
			System.out.println("El agno es bisiesto");
		else if (año % 4 == 0 && año % 100 != 0)
			System.out.println("El agno " + año + " es bisiesto");
		else
			System.out.println("El agno " + año + " NO es bisiesto");

	}//main

}//class
