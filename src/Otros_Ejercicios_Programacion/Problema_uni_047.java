/*Programa que, dadas las longitudes de 3 segmentos, determina si es posible hacer un triángulo con ellos y,
 * en caso afirmativo, averigua si se trata de un triángulo rectángulo, equilátero, isósceles o ninguno de estos.
 * 
 * Resolución:
 *  Pueden formar triángulo si la suma de cualquier pareja de lados es mayor al tercer lado.
 *  Rectángulo: a^2 = b^2 + c^2;
 *  Equilátero: a = b = c (los tres lados son iguales)
 *  Isósceles: 2 lados son iguales
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_047 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b , c; //segmentos
		
		System.out.println("Longitud del segmento 'A':");
		a = teclado.nextInt();
		System.out.println("Longitud del segmento 'A' = " + a);
		
		System.out.println("Longitud del segmento 'B':");
		b= teclado.nextInt();
		System.out.println("Longitud del segmento 'B' = " + b);
		
		System.out.println("Longitud del segmento 'C':");
		c = teclado.nextInt();
		System.out.println("Longitud del segmento 'C' = " + c);
		
		//Comprobación de si pueden formar un triángulo
		
		if( a + b > c && a + c > b && b + c > a) {
			if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
				System.out.println("Los segmentos pueden formar un triangulo RECTANGULO");
			else if( a == b && a == c && b == c)
				System.out.println("Los segmentos pueden formar un triangulo EQUILATERO");
			else if (a == b || a == c || b == c)
				System.out.println("Los segmentos pueden formar un triangulo ISOSCELES");
			else
				System.out.println("Los segmentos pueden formar un triangulo DE OTRO TIPO");
			
		}//if
		else
			System.out.println("Los segmentos NO pueden formar un triangulo.");
		

	}//main

}//class
