/*Programa que calcula los N primeros términos de la sucesión de Fibonacci.
 * La sucesión de Fibonacci viene definida de la siguiente manera:
 * f1 =1;
 * f2 = 2;
 * fn = fn-1 + fn-2, para n > 2.
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_065 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n; //Numero introducido por el usuario (tiene que ser n > 2)
		int fn1 = 1; // f n-1(Término anterior a n)
		int fn2 = 1; // f n-2 /Término anterior al anterior a n)
		int fn = 0;

		System.out.println("Introduce un numero para saber los terminos de la sucesion de Fibonacci");
		n = teclado.nextInt();
		
		System.out.println("Los " + n + " primeros terminos de la sucesion de Fibonacci son:");
		System.out.print(fn1 + ", " + fn2);
		for (int i = 3; i <= n; i++) {
			fn = fn1 + fn2;
			fn1 = fn2;
			fn2 = fn;
			System.out.print(", " + fn);
		}//for

		
	}//main

}//class
