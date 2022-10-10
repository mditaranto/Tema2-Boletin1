package boletin1;

import java.util.Scanner;

public class Ejerciciofinal {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduzca un numero entero: ");
		num1 = sc.nextInt();
		System.out.print("introduzca un numero entero: ");
		num2 = sc.nextInt();
		System.out.print("introduzca un numero entero: ");
		num3 = sc.nextInt();
		
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " y " + num2 + " da como resultado: " + num3);
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de " + num1 + " y " + num3 + " da como resultado: " + num2);
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de " + num2 + " y " + num3 + " da como resultado: " + num1);
		} else {
			System.out.println("No hay suma posible entre los numeros para que la solucion sea el otro");
		}
		
		sc.close();

	}

}
