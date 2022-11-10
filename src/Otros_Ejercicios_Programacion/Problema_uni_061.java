/*Programa que encuentra el entero más grande N para el cual la suma 1+2+3+...+N es menor que un
 * cierto valor límite (introducido por teclado).
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_061 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n= 0; //Número a calcular
		int suma = 0; //Suma 1+2+...+N
		int limite; //Número límite que introduce el usuario
		
		System.out.println("Introduzca un numero limite");
		limite = teclado.nextInt();
		System.out.println("Numero limite = " + limite);
		
		while (suma < limite) {
			n++;
			suma += n;
			
		}//while
		
		if ( suma >= limite)
			n--;
		
		
		System.out.println("El numero entero mas grande es " + n);
	}//main

}//class
