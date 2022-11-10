/* Programa que calcula el valor del polinomio de tercer grado: a * x3 + b * x^2 + c*x + d para un valor de x.
 * Los coeficientes (a, b, c, d) y el valor de x se introducirán por teclado.
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_043 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, x;
		double res;
		
		System.out.println("Introduzca el valor de a");
		a = teclado.nextInt();
		System.out.println("a = " + a);
		
		System.out.println("Introduzca el valor de b");
		b = teclado.nextInt();
		System.out.println("b = " + b);
		
		System.out.println("Introduzca el valor de c");
		c = teclado.nextInt();
		System.out.println("c = " + c);
		
		System.out.println("Introduzca el valor de d");
		d = teclado.nextInt();
		System.out.println("d = " + d);
		
		System.out.println("Introduzca el valor de x");
		x = teclado.nextInt();
		System.out.println("x = " + x);

		res = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;
		
		System.out.println("El resultado es: " + res);
	}//main

}//class
