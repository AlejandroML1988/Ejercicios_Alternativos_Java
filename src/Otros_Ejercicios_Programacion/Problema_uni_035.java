//Programa que intercambia el valor de dos variables (por ejemplo enteras)
//Es decir, si A = X y B = Y --> A = Y y B = X

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_035 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b;
		//int aux;
		System.out.println("Introduzca el valor de la primera variable 'a'");
		a = teclado.nextInt();
		System.out.println("a = " + a);
		
		System.out.println("Introduzca el valor de la primera variable 'b'");
		b = teclado.nextInt();
		System.out.println("b = " + b);
		
		System.out.println("Intercambiadas:");
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a + " b = " + b);
		
		/*
		 * con variable auxiliar
		 * aux = a;
		 * a = b;
		 * b = aux;
		 */
		

	}//main

}//class
