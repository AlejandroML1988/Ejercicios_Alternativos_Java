//Algoritmo que lee por teclado el radio de un círculo y muestra por pantalla el diámetro,
// la longitud de la circunferencia y el área de dicha circunferencia.
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_033 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int rad, diam;
		float longit, area;
		
		System.out.println("Introduzca el valor del radio");
		rad = teclado.nextInt();
		System.out.println("El radio introducido es " + rad);
		
		diam = 2 * rad;
		longit = 2 * (float) Math.PI * rad;
		area = (float) Math.PI * (float) Math.pow(rad, 2);
		
		System.out.println("Diametro: " + diam);
		System.out.println("Longitud: " + longit);
		System.out.println("Area: " + area);

	}//main

}//class
