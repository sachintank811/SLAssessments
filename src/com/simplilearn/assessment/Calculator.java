package com.simplilearn.assessment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, opt;

		while (true) {
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();

			System.out.println(
					"Enter your selection: \n1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Modulus \n6. Power");
			opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Result: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Result: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Result: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Result: " + (num1 / num2));
				break;
			case 5:
				System.out.println("Result: " + (num1 % num2));
				break;
			case 6:
				double result = 1.0;
				for (int i = 1; i <= num2; i++) {
					result = result * num1;
				}
				System.out.println("Result: " + result);
				break;
			default:
				System.out.println("Invalid operation.");

			}

			System.out.println("Do you wish to continue(y/n)?");
			if (sc.next().equals("n")) {
				break;
			}
		}
	}

}
