/*Programa que determina si 3 segmentos pueden formar un triángulo rectángulo
 * Triángulo es rectángulo si a^2 = b^2 + c^2.
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_046 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c; //lados
		
		System.out.println("Longitud del lado 'A'");
		a = teclado.nextInt();
		System.out.println("'A' = " + a);
		
		System.out.println("Longitud del lado 'B'");
		b = teclado.nextInt();
		System.out.println("'b' = " + b);
		
		System.out.println("Longitud del lado 'C'");
		c = teclado.nextInt();
		System.out.println("'c' = " + c);
		
		if ( Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
			System.out.println("Los segmentos pueden formar un triangulo rectangulo");
		else
			System.out.println("Los segmentos NO pueden formar un triangulo rectangulo");
		
		System.out.println(Math.pow(a, 2));
		System.out.println(Math.pow(b, 2));
		System.out.println(Math.pow(c, 2));
	}//main

}//class
