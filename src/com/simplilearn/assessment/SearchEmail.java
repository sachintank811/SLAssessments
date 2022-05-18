package com.simplilearn.assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String searchEmail = null;
		boolean found = false;

		ArrayList<String> emailID = new ArrayList<String>();
		emailID.add("sameer.parekh@gmail.com");
		emailID.add("sunny.deol@gmail.com");
		emailID.add("salman.khan@gmail.com");
		emailID.add("mahima.chauhan@gmail.com");
		emailID.add("ahmed.faisal@gmail.com");
		emailID.add("harry.steven@gmail.com");
		emailID.add("shoaib.akhtar@gmail.com");
		
		// Get the input back for a string
		System.out.println("Enter emailID that you need to search: ");
		searchEmail = sc.nextLine();

		for (String element : emailID) {
			if (element.equalsIgnoreCase(searchEmail)) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("The emailID you entered is found.");
		} else {
			System.out.println("The emailID you entered is not found.");
		}
	}

}
