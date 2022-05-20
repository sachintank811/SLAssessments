package com.simplilearn.assessment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteAppendFile {

	public static void main(String[] args) {

		int choice;
		Scanner scanner = new Scanner(System.in);

		// Creating infinite while loop
		while (true) {
			// Creating menu
			System.out.println("\nPress 1 for Write File");
			System.out.println("Press 2 for Read File");
			System.out.println("Press 3 for Append File");
			System.out.println("Press 4 for Delete File");
			System.out.println("Press 5 to Quit\n ");

			// Asking to make choice
			System.out.println("Make your choice:");
			choice = scanner.nextInt();

			// Creating switch case branch
			switch (choice) {

			case 1:
				try {
					FileWriter writer = new FileWriter("TestFile.txt", false);
					writer.write("Hello World");
					writer.close();
					System.out.println("File created and written data.");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try {
					FileReader reader = new FileReader("TestFile.txt");
					BufferedReader bufferedReader = new BufferedReader(reader);

					String line;

					while ((line = bufferedReader.readLine()) != null) {
						System.out.println(line);
					}
					reader.close();

				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				break;

			case 3:
				try {
					FileWriter writer = new FileWriter("TestFile.txt", true);
					writer.write("\r\nMore Content");
					writer.close();
					System.out.println("Append data.");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case 4:
				File file = new File("TestFile.txt");

				if (file.delete()) {
					System.out.println("File deleted successfully");
				} else {
					System.out.println("Failed to delete the file");
				}
				break;

			case 5:
				System.exit(0);
			}
		}
	}

}
