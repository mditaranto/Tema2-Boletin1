package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	
		public static void main(String[] args) {
			
			int num1;
			int num2;
			int num3;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("num1 ");
			num1 = sc.nextInt();
			System.out.print("num2 ");
			num2 = sc.nextInt();
			System.out.print("num3 ");
			num3 = sc.nextInt();
			
			if (num1 > num2 && num2 > num3) {
				System.out.println(num1+ ">" +num2+">"+num3);
			} else if (num1 > num3 && num3 > num2) {
				System.out.println(num1+ ">" +num3+">"+num2);
			} else if (num2 > num1 && num1 > num3) {
				System.out.println(num2+ ">" +num1+">"+num3);
			} else if (num2 > num3 && num2 > num1) {
				System.out.println(num2+ ">" +num3+">"+num1);
			} else if (num3 > num1 && num1 > num2) {
				System.out.println(num3+ ">" +num1+">"+num2);
			} else if (num3 > num2 && num2 > num1) {
				System.out.println(num3+ ">" +num2+">"+num1);	
			}
				
				
			sc.close();
	}
}
