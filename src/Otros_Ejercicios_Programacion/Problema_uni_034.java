//Algoritmo que calcula el número de vueltas que da una rueda de radio R al recorrer una distancia D.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_034 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int rad;
		float longitud;
		float dist;
		float vueltas;
		
		System.out.println("Introduzca el radio de la rueda ");
		rad = teclado.nextInt();
		System.out.println("El radio R es " + rad);
		
		System.out.println("Introduzca la distancia a recorrer");
		dist = teclado.nextFloat();
		
		
		longitud = 2 * (float) Math.PI * rad;
		System.out.println("La rueda recorre " + longitud + " metros por vuelta");
		
		vueltas = dist / longitud;
		
		System.out.println("La rueda da " + vueltas + " vueltas.");
		
	}//main

}//class
