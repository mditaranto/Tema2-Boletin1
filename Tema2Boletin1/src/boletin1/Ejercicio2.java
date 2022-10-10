package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Establecemos variables
		int num1; //En esta variable guardaremos el valor para el primero numero
		int num2; //En esta variable guardaremos el valor para el primero numero
		
		Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
		
		//Se le pide al usuario que introduzca un número
		System.out.print("Introduzca un numero: ");
		num1 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		//Se le pide al usuario que introduzca otro número
		System.out.print("Introduzca otro numero: ");
		num2 = sc.nextInt(); //Se lee el valor en su variable correspondiente
		
		if (num1 == num2) {
			System.out.println("Los numeros introducidos son iguales");
		} else {
			System.out.println("Los numeros introducidos son diferentes");
		
		sc.close(); //Se cierra el objeto Scanner


	}

}

	}

