//Programa que suma los numeros de 1 a N (introducido por teclado)
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_056 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int n; //Número leido por teclado
		int suma = 0;
		
		System.out.println("Introduca un numero:");
		n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++)
			suma +=i;
		
		System.out.println("La suma de los numeros de 1 a " + n + " es igual a " + suma);
	}//main

}//class
