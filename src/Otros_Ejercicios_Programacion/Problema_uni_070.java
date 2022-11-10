/*Descomposición factorial de un número entero. (Programa que la hace).
 * La descomposición factorial es descomponer un número en un productor de números primos.
 * Por ejemplo:
 * 12 = 2^2 * 3
 * 
 */
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_070 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num; //Numero leido por teclado
		boolean esPrimo = true;
		int cont = 2;
		int divisor = 2;
		int resto;
		boolean fin = false;
		String cadena ="";
		String cadenaFinal="";
		int pot = 1;
		
		System.out.println("Introduzca un numero para obtener su descomposicion factorial");
		num = teclado.nextInt();
		System.out.println("Numero introducido = " + num);
	
		while (fin == false) {
			while (esPrimo == true && cont < divisor / 2) {
			
				if(divisor % cont != 0 || cont == 2) {
					esPrimo = true;
					cont++;
				}//if
				else
					esPrimo = false;
						
			}//while
			if (esPrimo == false) {
				//System.out.println("no primo");
				divisor++;
			}//if
			else {
				//System.out.println("PRIMO");
				if (num % divisor != 0)
					divisor++;
				else {
					//System.out.print(divisor + " ");
					cadena += divisor;
					if (num / divisor == 1)
						fin = true;
					else
						divisor = 2;
						num = num / divisor;
				}//else
			
			}//else
			
		}// while fin == false
		
		System.out.println(cadena);
		
		cadenaFinal += cadena.charAt(0);
		
		for (int i= 1; i <= cadena.length()-1; i++)
			cadenaFinal += "*" + cadena.charAt(i);
		
		System.out.println(cadenaFinal);
	}//main
			
}//class
