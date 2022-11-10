/*En el principado de Rituania las reglas para determinar las pensiones de jubilación
 * son las siguientes:
 * 	- Las personas mayores de 65 años y que hayan trabajado durante al menos 10 años reciben
 * 	  por semana 40 rublos más 1 rublo adicional por año trabajado.
 *  
 *  - Las personas mayores de 65 años que no hayan trabajado durante 10 años reciben
 *    35 rublos a la semana.
 *    
 *  - Cualquier persona mayor de 75 años recibe 20 rublos adicionales por semana.
 *  
 *  Programa que lee por teclado la edad y los años trabajados de una persona y calcula su pensión.
 *  También detecta si la persona es demasiado joven para recibir una pensión (menor de 65 años).
 * 
 */
package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Leer teclado
		int edad;
		int años; //Años trabajados
		float pension; //Pension a recibir
		
		System.out.println("Introduzca edad de la persona:");
		edad = sc.nextInt();
		System.out.println("Introduzca agnos trabajados por la persona:");
		años = sc.nextInt();
		
		System.out.println("Edad = " + edad + " Agnos trabajados = " + años);
		
		if(edad < 65)
			System.out.println("La persona es demasiado joven para recibir una pension");
		
		else {
			
			if ( años >= 10)
				pension = 40 + años;
			else
				pension = 35;
			
			if(edad >= 75)
				pension += 20;
			
			System.out.println("La pensión es: " + pension);
		}//else	

	}//main

}//class
