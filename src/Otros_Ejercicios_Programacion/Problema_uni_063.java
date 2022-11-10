//Programa que calcula e imprime las potencias de 2 desde 0 a 10 (2^0, 2^1, 2^2, ..., 2^10)
package Otros_Ejercicios_Programacion;

public class Problema_uni_063 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++)
			System.out.println("2^"+ i + " = " + Math.pow(2, i));

	}//main

}//class
