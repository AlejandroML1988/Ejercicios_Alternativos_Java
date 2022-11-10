/*Programa que determina si un número mayor que 1 es primo (lo lee por teclado).
 * 
 */
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_068 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num; //Numero leído por teclado
		boolean esPrimo = true;
		int cont = 2;
		System.out.println("Introduzca un numero mayor que 1 para saber que es primo");
		num = teclado.nextInt();
		System.out.println("Numero introducido = " + num);
		
		while (num <= 1) {
			System.out.println("El numero " + num + " no es valido, debe ser mayor que 1.");
			num = teclado.nextInt();
		}//while
		
		while (esPrimo == true && cont < num / 2) {
			
			if(num % cont != 0) {
				esPrimo = true;
				cont++;
			}//if
			else
				esPrimo = false;
					
			
		}//while
		if (esPrimo == true)
			System.out.println("El numero" + num + " es primo");
		else
			System.out.println("El numero " + num + " no es primo porque es divisible por " + cont);
	}//main

}//class
