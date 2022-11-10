/*Programa que calcula el factorial de un numero entero positivo sabiendo que:
 * 0! = 1
 * n! = n ( n-1), para n> 0
 * 
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_062 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n; //Número para el que hay que calcular el factorial
		long fact = 1; //Factorial calculado
		int aux = 0; //Variable auxiliar
		
		System.out.println("Introduzca un numero para calcular su factorial");
		n = teclado.nextInt();
		System.out.println("El numero introducido es " + n);
		
		if (n == 0)
			fact = 1;
		else {
			
			for (int i = 1; i < n; i++) //Calculo factorial de n-1
				fact *= i;
			
		}//else
		fact *= n; //Esto sobraria si pongo en el for i <= n
		
		System.out.println(n + "! = " + fact);
	}//main

}//class
