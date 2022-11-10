/*Programa que averigua todos los resultados posibles al lanzar dos dados de 6 caras.
 * Solución:
 * Cada una de las caras del dado 'a' puede emparejarse con cada una de las caras del dado 'b':

 *  Algunos resultados se repiten, por ejemplo:
 *  dado 'a' = 5, dado 'b' = 4 resultado = 9
 *  dado 'a' = 4, dado 'b' = 5 resultado = 9
 *  
 * numero de caras = n (6)
 * numero de dados = k (2)
 * total = n^k;
 * 
 * ¿Cuántos resultados se repiten?
 * repetidos =(total - n) /2 (resto 2 al total porque se repiten 1:1, 2:2, 3:3, 4:4, 5:5 y 6:6)
 */


package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_055 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dados=2;
		int caras=6;
		int repet;
		int total;
		int resul;
		
		//Total de combinaciones (con repetición)
		total = (int)Math.pow(caras, dados); //(6^2)
		
		//Combinaciones repetidas
		repet = (total - caras)/2;
		
		//Resultados posibles: Total combinaciones - combinaciones repetidas
		resul = total - repet;
		
		System.out.println(resul);
		
	}//main

}//class
