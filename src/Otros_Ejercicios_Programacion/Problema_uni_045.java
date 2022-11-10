/*Programa que determina si 3 segmentos de longitudes A, B y C pueden formar un triángulo. (Leídos por tecl.)
 * (Esto es si cumplen que la suma de cualquier pareja de ellos es mayor que el tercero)
 * 
 * Resolución:
 * 	Si (a + b) > c pueden
 * 	si no
 * 		si (a + c) > b pueden
 * 		si no
 * 			si (b + c) > a pueden
 * 			si no NO pueden
 * 
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_045 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Longitud del lado 'A'");
		a = teclado.nextInt();
		System.out.println("'A = '" + a);
		
		System.out.println("Longitud del lado 'B'");
		b = teclado.nextInt();
		System.out.println("'B = '" + b);
		
		System.out.println("Longitud del lado 'C'");
		c = teclado.nextInt();
		System.out.println("'C = '" + c);

		if (a + b > c && a + c > b && b + c > a)
			System.out.println("Los tres segmentos pueden formar un triangulo.");
		else
			System.out.println("Los tres segmentos NO pueden formar un triangulo.");

		
	}//main

}//class
