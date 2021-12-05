package com.das.arrays;

import java.util.Scanner;

public class Temperature {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of past days for which you want to see avg temp ");
		int numberOfDays = scan.nextInt();
		int temp[] = new int[numberOfDays];
		Temperature temperature = new Temperature();
		temperature.averageTemperature(temp);
	}

	public void printTemperature() {

	}

	public void averageTemperature(int temp[]) {
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			int day = i + 1;
			System.out.println("Enter the day " + day + " avg temp :");
			temp[i] = scan.nextInt();
			sum = sum + temp[i];
		}
		int avg = sum / temp.length;
		System.out.println(avg);

	}

}
