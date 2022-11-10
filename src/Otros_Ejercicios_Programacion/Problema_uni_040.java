//Programa que calcular el valor absoluto de un numero real sin usar ninguna función predefinida
// Valor absoluto:
//		Si num > 0 --> valor absoluto = num
//		Si num < 0 --> valor absoluto = -num (es decir, el valor en positivo, o sea, 0 - (- num)

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_040 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num = -9.33; // Número introducido
		double abs = num; //Valor absoluto
		double absFun = num; //absFun para comprobar
		
		System.out.println("Introduce un numero para saber su valor absoluto");
		System.out.println("El numero introducido es " + num);
		
		
		//absFun = Math.abs(absFun); funcion predeterminada que calcula el valor absoluto
		
		if(num < 0)
			abs = 0 - num;
		
		System.out.println("El valor absoluto es: " + abs);
		//System.out.println(absFun); para comprobar que estaba bien, es decir, sale abs = absFun;
		
		
	}//main

}//class
