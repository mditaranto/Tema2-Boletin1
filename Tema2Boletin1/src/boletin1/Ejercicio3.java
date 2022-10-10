package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextDouble();
		
		if (num < 1 && num > -1 && num != 0) {
			System.out.println("El numero es casi-cero.");
		} else {
			System.out.println("El numero no es casi-cero. ");
		}
		
		sc.close();

	}
}
