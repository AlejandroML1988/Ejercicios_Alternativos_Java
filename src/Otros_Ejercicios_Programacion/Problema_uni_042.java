//Programa que resuelve la siguiente ecuación de primer grado: (ax + b = 0).
//a y b se introducen por teclado

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_042 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a;
		float b;
		float x;
		
		System.out.println("Introduzca el valor de a");
		a = teclado.nextInt();
		System.out.println("a = " + a);
		
		System.out.println("Introduzca el valor de b");
		b = teclado.nextInt();
		System.out.println("b = " + b);
		
		x = (-b) / a;
		
		System.out.println("x = " + x);
		

	}//main

}//class
