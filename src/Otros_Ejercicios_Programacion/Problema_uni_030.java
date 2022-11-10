//Programa que calcula la superficie de un círculo.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_030 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int rad;
		double area;
		
		System.out.println("Introduzca el radio de la circunferencia.");
		rad = teclado.nextInt();
		System.out.println("El radio introducido es: " + rad);
		
		area = 2 * rad * Math.PI;
		
		System.out.println("El area de la circunferencia es: " + area);

	}//main

}//class