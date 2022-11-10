/*Se considera la sucesión definida por:
 * A1 = 0	A2 = 1	An = 3* An-1 + An-2 para n > 2 (n-1 pos. anterior, n-2 pos. anterior a pos. n-1)
 * 
 * Programa que obtiene el valor y la posición del primer término de esta sucesión que sea
 * superior o igual a 1000.
 * 
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_067 {

	public static void main(String[] args) {
		int a1 = 0; //Posicion anterior a la anterior
		int a2 = 1; //Posición anterior
		int an = 0;
		int pos = 2; //Porque las 2 primeras ya las se.
		
		while (an <= 1000) {
			an = 3 * a2 + a1;
			a1 = a2;
			a2 = an;
			pos++;
		}//while
		System.out.println("Valor = " + an);
		System.out.println("Posicion = " + pos);
		
	}//main

}//class
