//Program que realiza la conversión de grados cenígrados (C) a grados Fahrenheit (F)

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_036 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int c;
		float f;
		
		System.out.println("Introduzca los grados centigrados:");
		c = teclado.nextInt();
		System.out.println("Grados centigrados: " + c);
		
		f = ((float) 9 / 5) * c + 32;
		
		System.out.println("Grados Fahrenheit: " + f);
		
	}//main

}//class
