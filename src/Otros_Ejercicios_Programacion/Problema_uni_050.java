/*Programa que, dado un número de 4 cifras, devuelve su numero con las cifras invertidas.
 * Ejemplo: numero = 1234  numero invertido = 4321
 */


package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_050 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, invertido = 0, resto;
		
		System.out.println("Introduce un numero para hallar su inverso");
		num = teclado.nextInt();
		
		while (num > 0) {
			
			resto = num % 10;
			invertido = invertido * 10 + resto;
			num /= 10;
			
		}//while
		
		System.out.println("El numero invertido es: " + invertido);

	  }//main

}//class

