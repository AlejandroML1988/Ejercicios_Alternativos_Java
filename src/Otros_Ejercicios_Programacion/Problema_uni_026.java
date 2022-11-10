//Programa que, a partir del precio neto de un artículo y de su % de IVA, calcula su precio de venta al público.
package Otros_Ejercicios_Programacion;

import java.util.Scanner;


public class Problema_uni_026 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int neto;
		int iva;
		float venta;
		
		System.out.println("Precio neto");
		neto = teclado.nextInt();
		
		System.out.println("IVA (%)");
		iva = teclado.nextInt();
		
		venta = neto + ( (float) neto * ( (float) iva/100));
		
		System.out.println("El precio es " + venta);
		
	}//main

}//class
