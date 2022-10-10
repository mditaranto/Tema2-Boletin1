package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		double x1, x2;
		double raiz;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a:");
		a = sc.nextInt();
		System.out.print("b:");
		b = sc.nextInt();
		System.out.print("c:");
		c = sc.nextInt();
		
		raiz = (b*b)-4*a*c;
		
		x1 = (-b+Math.sqrt(raiz))/2*a;
		x2 = (-b-Math.sqrt(raiz))/2*a;
		
		if (raiz < 0) {
			System.out.println("la ecuacion no tiene solucion real");
		} else {
			System.out.print("Las soluciones son " + x1 + " y " + x2);
		}
		
		sc.close();
		
	}

}
