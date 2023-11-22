package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Random random = new Random();
		int randomNumber = random.nextInt(100)+1;
		
		int numGuesses = 0;
		int maxGuesses = 5;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("The Number Guessing Game");
	}

}
