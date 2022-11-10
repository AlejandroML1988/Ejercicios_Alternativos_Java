/*Programa que, leída una letra por teclado, devuelve su posición en el alfabeto (tanto si es MAY como MINUS).
 * Ejemplo: Letra introducida 'A' --> posición 1
 * 			Letra introducida 'a' --> posición 1
 * Excluida letra 'ñ'
 * 
 * Solución:
 * En código ASCII, cada símbolo está representado por un número entero.
 * El número entero de la letra 'A' es 65.
 * Es decir, 'A' convertido a tipo int es igual a 65.
 * La posición de 'A' es 1.
 * Para tener 1, tengo que ver cuál es la diferencia: 65 - 1 = 64 (desplazamiento).
 * Así, 65 - 64 = 1 = Posición de A
 * Así, la letra B, que es 66 en 'int': 66-64 = 2 = Posición de B
 * Esto funcionaría solo para las mayúsculas, por que 'a' en int es 97
 * Así, 97 - 64 = 33.
 * Solución: Convertir una letra minúscula 'a' en mayúscula 'A' antes de convertirla a tipo int.
 */


package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_044 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String letra; //Para leer la letra por teclado
		String letraMay;//Letra en mayúsculas
		int letraNum;//Valor de la letra en ASCII.
		int pos;
		
		System.out.println("Introduzca una letra comprendida entre 'A' y 'Z' (excluida la 'Ñ' para conocer su posición en el alfabeto.");
		System.out.println("La letra puede ser mayúscula o minúscula");
		
		letra = (teclado.nextLine()); //Lee el string
		letraMay = letra.toUpperCase();
		letraNum = (int) (char) letraMay.charAt(0); //Pos 0 de letra, casteo a char y casteo a int (no se puede castear de String a char directamente)

		pos = letraNum - 64;
		
		System.out.println("La posicion de la letra " + "'" + letra + "' es la posicion " + pos + ".");

	}//main

}//class
