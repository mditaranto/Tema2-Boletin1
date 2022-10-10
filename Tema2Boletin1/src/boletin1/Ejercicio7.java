package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if (num<10) {
			System.out.println("numero 1 cifras");
		} else if (num<99) {
			System.out.println("numero 2 cifras");
		} else if (num<999) {
			System.out.println("numero 3 cifras");
		} else if (num<9999) {
			System.out.println("numero 4 cifras");
		} else if (num<99999) {
			System.out.println("numero 5 cifras");
		}
		
		sc.close();
	}
}
