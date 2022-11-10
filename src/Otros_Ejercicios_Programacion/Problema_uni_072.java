//Programa que calcula Pi (primera forma), n digitos leido por teclado.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_072 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int n; //numero leido por teclado;
		double pi= 0;
		System.out.println("Introduce el numero de terminos de la sucesion");
		n = teclado.nextInt();
		
		for(int i = 0; i <= n; i++)
			pi += Math.pow(-1, i) / (2 * i + 1);
		
		pi *= 4;
		System.out.println(pi);
	}//main

}//class
