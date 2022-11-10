//Secuencia de instrucciones que calcula el cuadrado de un número introducido por teclado

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_028 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int cuadrado;
		
		System.out.println("Introduzca un numero para calcular su cuadrado");
		num = teclado.nextInt();
		
		cuadrado = (int) Math.pow(num, 2);
		System.out.println("El cuadrado de " + num + " es " + cuadrado);

	}//main

}//class