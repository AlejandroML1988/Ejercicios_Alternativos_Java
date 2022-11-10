/*Programa que lee por teclado dos enteros M, N (0 < M < 80, 0 < N < 25)
 * y muestre en pantalla un rectángulo de N filas y M columnas dibujado con asteriscos
 * (únicamente deben dibujarse las líneas del rectángulo.
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_060 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int m; //Número de columnas del rectángulo.
		int n; //Número de filas del rectángulo.
		String cadena=""; //Para guardar lo que quiero imprimir
		
		System.out.println("Introduzca el numero de columnas (0 < M < 80)");
		m = teclado.nextInt();
		while (m < 0 || m > 80) {
			System.out.println("Valor incorrecto.");
			System.out.println("Introduzca el numero de columnas (0 < M < 80)");
			m = teclado.nextInt();
		}//while
		

		
		System.out.println("Introduzca el numero de filas (0 < n < 25)");
		n = teclado.nextInt();
		while (n < 0 || n > 25) {
			System.out.println("Valor incorrecto.");
			System.out.println("Introduzca el numero de filas (0 < n < 25)");
			n = teclado.nextInt();
		}//while
		
		System.out.println("Numero de columnas = " + m);
		System.out.println("Numero de filas = " + n);
		
		//Genero la primera fila (que es igual a la última) de asteriscos.
		for (int  i = 1; i <= m; i++)
			cadena += "*";
		System.out.println(cadena);
		//Imprimo la primera fila (de asteriscos)
		
		for (int i = 2; i < n; i++) {
			
			for (int j = 1; j < m; j++) { //Para todas las columnas menos el último, que será println
				
				if ( i != 1 || i != n) {
					
					if (j == 1)
						System.out.print("*");
				
					else
						System.out.print(" ");
				}//if
				
			}//for columnas
			System.out.println("*");
			
		}//for filas
		
		System.out.println(cadena); //Imprimo la última fila de asteriscos
	}//main

}//class
