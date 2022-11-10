//Programa que lee cuatro datos, calcula y visualiza su producto, suma y media aritmética.
package Otros_Ejercicios_Programacion;

import java.util.Scanner;


public class Problema_uni_025 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int prod;
		int suma;
		float med;
		
		System.out.println("Introduzca el primer numero");
		num1 = teclado.nextInt();
		System.out.println("El primer numero es " + num1);
		System.out.println("Introduzca el segundo numero");
		num2 = teclado.nextInt();
		System.out.println("El segundo numero es " + num2);
		System.out.println("Introduzca el tercer numero");
		num3 = teclado.nextInt();
		System.out.println("El tercer numero es " + num3);
		System.out.println("Introduzca el cuarto numero");
		num4 = teclado.nextInt();
		System.out.println("El cuarto numero es " + num4);
		
		prod = num1 * num2 * num3 * num4;
		suma = num1 + num2 + num3 + num4;
		med = (float) suma / 4;
		
		System.out.println("El producto es: " + prod);
		System.out.println("La suma es: " + suma);
		System.out.println("La media aritmetica es: " + med);
		
	}//main

}//class
