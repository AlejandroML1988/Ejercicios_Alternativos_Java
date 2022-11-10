//Algoritmo que determina el área y el volumen de un cilindro cuyas dimensiones (radio y altura)
//Se miden desde teclado

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_032 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int radio;
		int alt;
		float area;
		float vol;
		
		System.out.println("Introduzca el valor del radio del cilindro");
		radio = teclado.nextInt();
		System.out.println("El radio es " + radio);
		
		System.out.println("Introduzca el valor de la altura del cilindro");
		alt = teclado.nextInt();
		System.out.println("La altura es " + alt);
		
		area = 2 * (float) Math.PI * radio * alt + 2 * (float) Math.PI * (float) Math.pow(radio, 2);
		System.out.println("El area es: " + area + " m^2");
		
		vol = (float) Math.PI * (float) Math.pow(radio,2) * alt;
		System.out.println("El volumen es: " + vol + " m^3");
	}//main

}//class