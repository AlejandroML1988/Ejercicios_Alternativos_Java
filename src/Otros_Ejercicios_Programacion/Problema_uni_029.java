//Programa que calcula perímetro y superficie de un rectángulo dadas la base y altura.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_029 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base;
		int altura;
		int per;
		int area;
		
		System.out.println("Introduzca el valor de la base");
		base = teclado.nextInt();
		System.out.println("El valor de la base es: " + base);
		
		System.out.println("Introduzca el valor de la altura");
		altura = teclado.nextInt();
		System.out.println("El valor de la altura es: " + altura);
		
		per = 2 * (base + altura);
		area = base * altura;
		
		System.out.println("El perimetro es: " + per);
		System.out.println("La superficie es: " + area);
		
	}//main

}//class
