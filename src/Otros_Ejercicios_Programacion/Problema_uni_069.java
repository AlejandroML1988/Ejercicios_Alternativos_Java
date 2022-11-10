//Algoritmo que, dados dos números naturales, calcula el cociente y el resto sin utilizar DIV o MOD.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_069 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dividendo;
		int divisor;
		int cociente = 0;
		int resto;
		boolean fin = false;
		
		System.out.println("Introduzca el dividendo ");
		dividendo = teclado.nextInt();
		System.out.println("Dividendo = " + dividendo);
		
		System.out.println("Introduzca el divisor");
		divisor = teclado.nextInt();
		System.out.println("Divisor = " + divisor);
		System.out.println("");
		
		while (fin == false) {
			
			
			if (dividendo > divisor) {
			dividendo = dividendo - divisor;
			cociente ++;
			
			}else
				fin = true;
			
		}//while
		System.out.println("Cociente = " + cociente);
		System.out.println("Resto = " + dividendo);
		
	}//main

}//class
