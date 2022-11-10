/*Un corredor de maraton (42,195 km) ha recorrido la carrera en H horas y M minutos. (H y M por teclado)
 * Este algoritmo calcula el tiempo medio empleado en recorrer un kilómetro.
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;


public class Problema_uni_039 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int h;
		int min;
		int t; // tiempo total
		float X = (float) 42.195; //distancia
		float vel;
		
		System.out.println("Introduce las horas");
		h = teclado.nextInt();
		System.out.println("Horas = " + h);
		
		System.out.println("Introduce los minutos");
		min = teclado.nextInt();
		System.out.println("Minutos = " + min);
		
		t = min + h * 60; //Tiempo total en minutos
		
		vel = X/t;
		
		System.out.println("Velocidad media = " + vel + "km/min");

	}//main

}//class
