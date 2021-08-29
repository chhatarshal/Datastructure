package com.csingh.datastructure.assignments;

public class PrintPatterns {
	
	public static void main(String[] args) {
		
		System.out.println("Patern 1");
		printPattern1();
		
		System.out.println("Patern 2");
		printPattern2();
		
		System.out.println("Patern 3");
		printPattern3();
		

		System.out.println("Patern 4");
		printPattern4();
		
		System.out.println("Patern 5");
		printPattern5();
		
		
	}

	
	public static void printPattern1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	public static void printPattern2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	public static void printPattern3() {
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	public static void printPattern4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}
	
	public static void printPattern5() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
