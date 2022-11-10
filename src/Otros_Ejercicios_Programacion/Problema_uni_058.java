/*Programa que imprime una tabla de conversión de kilómetros a millas sabiendo que:
 * 1 milla marina = 1852 metros.
 * 1 milla terrestre = 1609 metros.
 * MEJORA: Lee por teclado una cantidad de millas (a elegir por el usuario) y devuelve la conversión en km.
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_058 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float km; //Numero de kilómetros introducido
		float millas; //Numero de millas final
		int tipo; //Tipo de millas elegido, "1" marinas o "2" terrestres
		
		System.out.println("Por favor, introduzca la cantidad de kilometros a convertir");
		km = 1000 * teclado.nextFloat(); //Leo y lo conviero a metros.
		
		System.out.println("1km = " + (km / 1852) + " millas marinas.");
		System.out.println("1km = " + (km / 1609) + " millas terrestres.");
		
		System.out.println("A que tipo de millas quiere convertir los km introducidos?");
		System.out.println("Milla marina: --> '1'");
		System.out.println("Milla terrestre: --> '2'");
		tipo = teclado.nextInt();
		

		
		if (tipo == 1) {
			millas = km / 1852;
			System.out.println("La cantidad de km equivale a " + millas + " marinas.");
		}//if
		else {
			millas = km / 1609;
			System.out.println("La cantidad de km equivale a " + millas + " terrestres.");
		
		}//else
		
		
	}//main

}//class
