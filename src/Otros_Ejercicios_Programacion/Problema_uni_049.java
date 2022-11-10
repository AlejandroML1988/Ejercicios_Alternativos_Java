//Programa que calcula el número cuyo valor es el central de tres números (no es el mayor ni el menor)
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_049 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Introduce 3 numeros");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		System.out.println("Numeros: " + a + " " + b + " " + c);
		
		if((a > b && a < c) || (a < b && a > c))
			System.out.println("El numero central es " + a);
		
		else if ((b > a && b < c) || ( b > c && b < a))
			System.out.println("El numero central es " + b);
		
		else
			System.out.println("El numero central es " + c);
		
	}//main

}//class
