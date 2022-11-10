/*Algoritmo que lee una fecha con formato dd/mm/aa y la escribe con el formato "dia" de "mes" de "año
 * Por ejemplo: Lee 2/1/2001
 * Imprime: 2 de Enero de 2001
 */

package Otros_Ejercicios_Programacion;

import java.util.Scanner;

public class Problema_uni_054 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena; //Fecha leida por teclado
		String dia = ""; //Dia a imprimir
		String mes = ""; //Mes a imprimir
		String año = ""; //Año a imprimir
		boolean fecha = true; //Para imprimir al final
		int cont= 0; //Para ir eligiendo posicion a leer de char en la cadena.
		
		cadena = teclado.nextLine();
		
		//Para saber el dia. Leo char en posicion "cont" hasta que no sea '/'
		while (cadena.charAt(cont) != '/') {
			dia += cadena.charAt(cont);
			cont++;
		}//while
		
		cont++;
		
		//Para saber el mes. El leo char en posicion "cont" hasta que no sea '/'
		while (cadena.charAt(cont) != '/') {
			mes += cadena.charAt(cont);
			cont++;
		}//while
		cont++;
		
		//Para saber el año. Leo char en posicion "cont" hasta que con = longitud de cadena.
		while (cont < cadena.length()) {
			año += cadena.charAt(cont);
			cont++;
		}//while
		
		//Para cambiar mes de numero a nombre del mes.
		switch (mes) {
		
		case "1": case "01":
			mes = "Enero";
			break;
			
		case "2": case "02":
			mes = "Febrero";
			break;
			
		case "3": case "03":
			mes = "Marzo";
			break;
			
		case "4": case "04":
			mes = "Abril";
			break;
			
		case "5": case "05":
			mes = "Mayo";
			break;
			
		case "6": case "06":
			mes = "Junio";
			break;
			
		case "7": case "07":
			mes = "Julio";
			break;
			
		case "8": case "08":
			mes = "Agosto";
			break;
		
		case "9": case "09":
			mes = "Septiembre";
			break;
			
		case "10":
			mes = "Octubre";
			break;
			
		case "11":
			mes = "Noviembre";
			break;
			
		case "12":
			mes = "Diciembre";
			break;
			
		default:
			fecha = false;
		}//swtich
		
		//Para imprimir:
		//Mes valido
		if (fecha == true)
			System.out.println(dia + " de " + mes + " de " + año );
		//Mes no valido (por ejemplo mes 20
		else
			System.out.println("Fecha incorrecta, el mes no es valido.");
		
	}//main

}//class
