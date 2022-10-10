package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int jugada1;
		int jugada2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca: [1] tijeras [2] piedra [3] papel ");
		jugada1 = sc.nextInt();
		System.out.print("Introduzca: [1] tijeras [2] piedra [3] papel ");
		jugada2 = sc.nextInt();
		
		if (jugada1 == 3 && jugada2 == 2 || 
			jugada1 == 1 && jugada2 == 3 || 
			jugada1 == 2 && jugada2 == 1) {
			System.out.println("gana jugador 1");
		}  else if (jugada1 == jugada2) {
			System.out.println("Empate");
		} else {
			System.out.println("Gana jugador 2");
		}
		
		sc.close();

	}

}
