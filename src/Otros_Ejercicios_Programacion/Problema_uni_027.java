//Programa que, dada una cantidad de tiempo en segundos, calcula su equivalente en horas, minutos y segundos.

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_027 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int horas;
		int min;
		int min1;
		int seg;
		
		System.out.println("Introduzca una cantidad de segundos");
		num = teclado.nextInt();
		
		
		horas = num / 3600;
		min = (num - (horas * 3600)) / 60;
		seg = num - (horas * 3600) - (min * 60);

		
		System.out.println("Horas " + horas);
		System.out.println("Minutos " + min);
		System.out.println("Segundos " + seg);
		
		
	}//main
	
}//class
