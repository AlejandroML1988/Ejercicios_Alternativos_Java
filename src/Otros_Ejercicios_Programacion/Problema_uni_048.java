//Programa que determina si 3 numeros se introducen de forma creciente, decreciente o desordenada

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_048 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Primer numero:");
		a = teclado.nextInt();
		System.out.println("Primer numero = " + a);
		
		System.out.println("Segundo numero:");
		b = teclado.nextInt();
		System.out.println("Segundo numero = " + b);
		
		System.out.println("Tercer numero:");
		c = teclado.nextInt();
		System.out.println("Tercer numero = " + c);
		
		if (a < b && b < c)
			System.out.println("Creciente");
		else if (a > b && b > c)
			System.out.println("Decreciente");
		else
			System.out.println("Desordenada");

	}//main

}//class
