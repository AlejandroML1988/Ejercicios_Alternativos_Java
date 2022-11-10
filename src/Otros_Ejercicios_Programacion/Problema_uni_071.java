/*Programa que calcula el Máximo Común Divisor de dos enteros positivos, a y b, por el algoritmo de Euclides.
 * 
 * q1 = cociente entero de a entre b, r1 el resto.
 * q2 = cociente entero de b entre r1, r2 el resto.
 * q3 = cociente entero entre r1 y r2, r3 el resto.
 * Y así sucesivamente.
 * Cuando un resto 'i' sea = 0, resto 'i-1' será el MCD.
 * 
 */
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_071 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b; //Enteros leídos por teclado
		int resto, restoAnt;
		int mcd;
		int aux = 0;
		
		System.out.println("Introduce el primer entero para calcular MCD");
		a = teclado.nextInt();
		System.out.println("a = " + a);
		System.out.println("Introduce el segundo entero para calcular MCD");
		b = teclado.nextInt();
		System.out.println("b = " + b);
		
		restoAnt = a % b;
		if( restoAnt == 0)
			mcd = b;
		else {
			resto = b % restoAnt;
			
			if (resto == 0)
				mcd = restoAnt;
			else {
		
				while(resto != 0) {
					aux = resto;
					resto = restoAnt % resto;

					restoAnt = resto;
				}//do
				
			
					mcd = aux;
				
			}//else
		}//else
		System.out.println("MCD = " + mcd);
	}//main

}//class
