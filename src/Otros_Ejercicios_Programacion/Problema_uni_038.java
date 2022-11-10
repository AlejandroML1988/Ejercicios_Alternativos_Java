/*Algoritmo que, dado un tiempo, calcula tanto la distancia recorrida como la velocidad media
 * de un objeto que cae durante dicho tiempo.
 * distancia = cuadrado del tiempo (t^2) multiplicado por la mitad de la aceleración
 * debida a la gravedad (9.81m/s^2)
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_038 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int t; //tiempo, introducido por usuario
		float G = (float) 9.81 / 2; //cte aceleracion de la gravedad
		float x; //distancia recorrida por el objeto
		float vel;
		
		System.out.println("Introduzca un valor de tiempo para calcular la distancia y velocidad media");
		t = teclado.nextInt();
		System.out.println("Tiempo (s) = " + t);
		
		x = G * (float) Math.pow(t, 2);
		vel = x / t;
		
		System.out.println("Distancia (m) = " + x);
		System.out.println("Velocidad media (m/s) = " + vel);
		
	}//main

}//class
