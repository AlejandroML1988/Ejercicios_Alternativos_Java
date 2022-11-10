//Programa que calcula Pi (segunda forma), n digitos leido por teclado.
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_072b {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		double pi = 0;
		
		System.out.println("Introduce el numero de terminos de la sucesion");
		n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++)
			pi += 6 / (i * i);
		
		pi = Math.sqrt(pi);
		
		System.out.println(pi);

	}//main

}//class
