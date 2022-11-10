//Algoritmo que imprime las 30 primeras potencias de 4.
//En lugar de que sean del numero 4, lo hago del número 'n' introducido por teclado.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_059 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n; //Nº leido por teclado.
		double pot; //Resultado de la potencia de n^i. Uso método Math.pow que devuelve un double.
		
		System.out.println("Introduzca un numero para saber sus 30 primeras potencias");
		
		n = teclado.nextInt();
		
		for (int i = 0; i < 30; i++) { //1a potencia es 0, la numero 30 será 30-1 (29)
			pot = Math.pow(n, i); //Devuelve doube
			System.out.println(n + "^" + i + " = " + pot);
			
		}//for

	}//main

}//class
