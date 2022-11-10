//Problema que calcula, por separado, la suma de los numeros pares e impares comprendidos entre 1 y 1000.
//He hecho el programa que pide el numero por teclado, así servirá para cualquier número. (excluye el número)

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_057 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n; //Número leído
		int sumaImpar = 0;
		int sumaPar =0;
		
		System.out.println("Introduzca un numero para saber la suma de los pares e impares menores que el");
		n = teclado.nextInt();
		
		for (int i= 1; i < n; i++){//Excluye el número, para incluirlo sería i <= n
			
			if ( i % 2 != 0) //Si no es par lo sumo a impares
				sumaImpar +=i;
			else
				sumaPar +=i; //Si es par lo sumo a pares
		}//for
		
		System.out.println("Suma numeros impares = " + sumaImpar);
		System.out.println("Suma numeros pares = " + sumaPar);
	}//main

}//class
