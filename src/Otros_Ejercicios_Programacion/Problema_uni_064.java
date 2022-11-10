/*Programa que, dados un número real positivo X y un número entero N (leídos por teclado),
 * calcula el restuldado de elevar X a la N-ésima potencia.
 * 
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_064 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float x; //Número real positivo
		int n; //Número entero
		double res; //Resultado
		
		System.out.println("Introduzca un numero real positivo 'X', por ejemplo 5,9");
		x = teclado.nextFloat();
		System.out.println("X = " + x);
		
		System.out.println("Introduzca un numero entero 'N', por ejemplo 8");
		n = teclado.nextInt();
		
		res = Math.pow(x, n);
		System.out.println(x + " ^ " + n + " = " + res);
		
		
		

	}//main

}//class
