package boletin1;


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1: ");
		num1 = sc.nextInt();
		System.out.print("num2: ");
		num2 = sc.nextInt();
		
		if (num1<num2) {
			System.out.println(num2 + " > " + num1);
		} else {
			System.out.println(num1 + " > " + num2);
		}
		
		sc.close();
	}

}
