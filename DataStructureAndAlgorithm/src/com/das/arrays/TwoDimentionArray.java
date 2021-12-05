package com.das.arrays;

import java.util.Arrays;

public class TwoDimentionArray {

	public static void main(String[] args) {
		int arr[][] = new int[5][4];
		TwoDimentionArray twoDimentionArray = new TwoDimentionArray(arr);
		arr[1][1] = 0;
		twoDimentionArray.insertInArray(arr, 1, 1, 5);
		twoDimentionArray.printArray(arr);

	}

	// Step 1 is to initialize all the values in the array with a default Min Number
	// This is the right way to deal with Array in a framework so that when there is
	// a zero value that should not be treated as a blank value
	TwoDimentionArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	// This following will help to make sure we are only updating the non blank
	// values else it will give a warning that you're inserting a value where you
	// shouldn't. When you want to still insert then you can use another method.
	public static void insertInArray(int arr[][], int index1, int index2, int value) {
		if (arr[index1][index2] == Integer.MIN_VALUE) {
			arr[index1][index2] = value;
		} else {
			System.out.println("Your array for index is not empty " + arr[index1][index2]);
		}
	}

	public static void printArray(int arr[][]) {
		System.out.println(Arrays.deepToString(arr));
	}
}
