//Programa que calcula la hipotenusa de un triángulo rectángulo conocidas las longitudes de los catetos.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_031 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		int b;
		float c;
		
		System.out.println("Introduzca la longitud del primer cateto");
		a = teclado.nextInt();
		System.out.println("La longitud es :" + a);
		System.out.println("Introduzca la longitud del segundo catero");
		b = teclado.nextInt();
		
		c =  (float) Math.sqrt(a * a + b * b);
		System.out.println("La longitud de la hipotenusa es " + c);

	}//main

}//class
