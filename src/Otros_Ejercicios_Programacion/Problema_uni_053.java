/*Las tarifas en vigor en la RENFE en un año determinado prevén que un niño, si es
 * menor de cuatro años, viaje gratuitamente o, si su edad está entre los cuatro y los once (ambos
 * inclusive), pague medio billete. Este descuento del 50% se acumula a las eventuales reducciones
 * "tarjeta-familia" y "familia numerosa" que se describen a continuación:
 * 
 * a)Tarjeta-familia: Cualquier familia que tenga al menos un hijo puede obtenet una tarjeta-familia.
 * Esta tarjeta da derecho, en todo viaje de varios miembros de la familia, a reducciones según el
 * principio siguiente:
 * 
 * 		-La primera persona paga su billete a precio de tarifa normal (si va un adulto en el viaje, la
 * 		 primera persona será obligatoriamente el adulto, y el billete es, en este caso, un billete de
 * 		 "plaza entera").
 * 		- Las otras personas tienen una reducción del 50% sobre el precio que deberían pagar normalmente.
 * 
 * b)Familia numerosa: cada miembro de una familia con tres hijos puede beneficiarse cuando viaja
 * (incluso solo) de una reducción del 30% en el precio que debería pagar normalmente.
 * 
 * Para un viaje dado, una familia con tres hijos no puede acumular las ventajas de la tarjeta-familia y
 * las de la tarifa "familia numerosa", y debe pues elegir las tarifas que le son más ventajosas en el
 * marco del viaje previsto.
 * Por el contrario, si una familia completa, con tres hijos de 5, 7 y 9 años viaja
 * en un trayecto de coste C para una persona sin reducción, la tarifa "tarjeta-familia" corresponderá a
 * un coste total de 2,25 C, inferior al coste obtenido con la reducción "familia numerosa" (2,45 C).
 * 
 * Construye un algoritmo que, para un proyecto de viaje dado de una familia con tres hijos, aconseje
 * la tarifa más ventajosa.
 */
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edadA1, edadA2, edadN1, edadN2, edadN3; //Edades de los 2 adultos y 3 niños
		double precioA1, precioA2, precioN1, precioN2, precioN3; //Precios de los billetes de cada adulto y cada niño
		double precioA1b, precioA2b, precioN1b, precioN2b, precioN3b; //Precios para familia numerosa.
		int C = 10; //Precio normal del billete, es una constante
		double totalTar, totalFam; //Para sumar el precio total y decidir entre tarjeta familia o familia numerosa.
		System.out.println("Edad primer adulto");
		edadA1 = sc.nextInt();
		System.out.println("Edad segundo adulto");
		edadA2 = sc.nextInt();
		System.out.println("Edad primer niño");
		edadN1 = sc.nextInt();
		System.out.println("Edad segundo niño");
		edadN2 = sc.nextInt();
		System.out.println("Edad tercer niño");
		edadN3 = sc.nextInt();
		
		precioA1 = precioA2 = precioN1 = precioN2 = precioN3 = C;
		precioA1b = precioA2b = precioN1b = precioN2b = precioN3b = C;
		
		//Cálculo de la tarifa normal de cada niño (la tarifa normal de un adulto tiene precio normal C)	
		if (edadN1 < 4)
			precioN1 = precioN1b= 0;
		else if (4 <= edadN1 && edadN1 <= 11)
			precioN1 = precioN1b = 0.5 * C;

		
		if (edadN2 < 4)
			precioN2 = precioN2b = 0;
		else if (4 <= edadN2 && edadN2 <= 11)
			precioN2 = precioN2b = 0.5 * C;
		
		if (edadN3 < 4)
			precioN3 = precioN3b = 0;
		else if (4 <= edadN3 && edadN3 <= 11)
			precioN3 = precioN3b = 0.5 * C;
		
		System.out.println("Niño 1: " + precioN1);
		System.out.println("Niño 2: " + precioN2);
		System.out.println("Niño 3: " + precioN3);
		//Cálculo de la tarifa normal
		
		//Tarjeta familia (Primer adulto normal, resto pagan 50% del billete)
		precioA2 *= 0.5;
		precioN1 *= 0.5;
		precioN2 *= 0.5;
		precioN3 *= 0.5;
		totalTar = precioA1 + precioA2 + precioN1 + precioN2 + precioN3;

		
		//Tarjeta familia
		
		//Familia Numerosa
		precioA1b*= 0.7;
		precioA2b*= 0.7;
		precioN1b *= 0.7;
		precioN2b *= 0.7;
		precioN3b *= 0.7;
		totalFam = precioA1b + precioA2b + precioN1b + precioN2b + precioN3b;
		
		System.out.println("Precio total tarjeta-familia = " + totalTar);
		System.out.println("Precio total familia numerosa = " + totalFam);
		
		if (totalTar > totalFam )
			System.out.println("Mejor opcion: Familia numerosa.");
		else if (totalFam > totalTar)
			System.out.println("Mejor opcion: Tarjeta-familia.");
		else
			System.out.println("Ambas opciones cuestan lo mismo");
	}//main

}//class
