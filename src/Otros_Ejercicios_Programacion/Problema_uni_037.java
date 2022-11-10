//Programa que cambia las longitudes en milimetros a yardas, pies y pulgadas.
// 1 yarda = 3 pies,  1 pie = 12 pulgadas y 1 pulgada = 25,4 mm.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_037 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int longitud;
		float pul;
		float pie;
		float yar;
		int resto; //En mm
		
		System.out.println("Introduzca la longitud en mm");
		longitud = teclado.nextInt();
		System.out.println("Longitud = " + longitud + " mm.");
		
		yar = (int) (longitud / (3 * 12 * (float) 25.4));
		System.out.println("Yardas: " + yar);

		resto = longitud - (int) (yar * (3 * 12 * (float) 25.4));
		
		pie = (int) (resto / (12 * (float) 25.4));
		System.out.println("Pies: " + pie);
		
		resto = resto - (int) (pie * (12 * (float) 25.4));
		
		pul = resto / (float) 25.4;
		System.out.println("Pulgadas: " + pul);

	}//main

}//class
