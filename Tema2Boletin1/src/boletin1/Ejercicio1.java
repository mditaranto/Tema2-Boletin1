package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();
		
		if (num%2 == 0) {
			System.out.println("El numero es par");
				
		} else {
			System.out.println("El numero es impar");
		}
		
		sc.close();
	}
}
