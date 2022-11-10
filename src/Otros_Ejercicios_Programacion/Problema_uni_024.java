//Programa que lee por teclado un valor entero, lo dobla, lo multiplica por 25 e imprime el resultado.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_024 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número");
		num = teclado.nextInt();
		num = 2 * num;
		num = 25 * num;
		
		System.out.println("El resultado es: " + num);

	}

}
