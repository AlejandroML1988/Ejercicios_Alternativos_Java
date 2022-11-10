/*Algoritmo para hallar los números de Catalan:
 * 1	1	2	5	14	42	132	429
 * teniendo en cuenta que si C es el último término hallado de la secuencia, y N la posición del siguiente,
 * éste será: C * (4 * N- 6) / N
 * 
 */
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_066 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int c = 1; //Último número hallado de la secuencia
		int m; //Cantidad de números a hallar
		int res; //Resultado
		
		System.out.println("Introduzca la cantidad de numeros de Catalan a hallar");
		m = teclado.nextInt();
		System.out.println("Cantidad = " + m);
		
		for (int n = 1; n < m; n ++ ) {
			res = c * (4 * (n + 1) - 6) / (n +1);
			c = res;
			System.out.print(c + " ");
		}//for

	}//main

}//class
