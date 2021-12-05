package com.das.arrays;

import java.util.Arrays;

public class ArraysSpecial {
	public static void main(String[] args) {

		ArraysSpecial arraysSpecial = new ArraysSpecial();
		// One D Array
		int arrOneD[] = { 2, 49, 66, 23, 21, 54, 33, 91, 98, 93, 66, 21, 49, 2, 21 };
		int arrOneD2[] = new int[4];
		arrOneD2[0] = 13;
		arrOneD2[1] = 16;
		arrOneD2[2] = 19;

		// Two D array
		int arrTwoD[][] = new int[3][3];
		arrTwoD[0][0] = 22;
		arrTwoD[0][1] = 24;
		arrTwoD[0][2] = 24;

		arrTwoD[1][0] = 36;
		arrTwoD[1][1] = 38;
		arrTwoD[1][2] = 24;

		arrTwoD[2][0] = 32;
		arrTwoD[2][1] = 33;
		arrTwoD[2][2] = 34;

//		arrTwoD[3][0] = 35;
//		arrTwoD[3][1] = 37;
//		arrTwoD[3][2] = 39;
//		arraysSpecial.arrayToString(arrOneD);
//		arraysSpecial.arrayDeepToString(arrTwoD);
//		arraysSpecial.deleteFromIntArray(arrOneD, 2);
//		arraysSpecial.returnMiddleArray(arrOneD);
//		System.out.println(Arrays.toString(arraysSpecial.returnMiddleArray(arrOneD)));
//		System.out.println(Arrays.toString(arraysSpecial.returnMiddleArrayCopyOfMethod(arrOneD)));
//		System.out.println(arraysSpecial.sumDiagonal(arrTwoD));
//		arraysSpecial.getTopTwoScore(arrOneD);
//		arraysSpecial.getTopTwoScoreWithoutSorting(arrOneD);

		arraysSpecial.removeDuplicateFromArray(arrOneD);

	}

	// When we have one D array then we use this one
	public void arrayToString(int[] arrOneD) {
		System.out.println(Arrays.toString(arrOneD));
	}

	// When we have nested arrays then we use deepToString
	public void arrayDeepToString(int[][] arrTwoD) {
		System.out.println(Arrays.deepToString(arrTwoD));
	}

	// Deleting an element from an array means updating that value to 0
	// But many practices to put the minimum value in the array so that 0 value
	// could be used in the array
	public void deleteFromIntArray(int[] arrOneD, int indexValue) {
		arrOneD[indexValue] = Integer.MIN_VALUE;
		System.out.println(Arrays.toString(arrOneD));
	}

	// Function that returns a new array without the first and last element without
	// using copy of element method
	public int[] returnMiddleArray(int arrOneD[]) {
		if (!(arrOneD.length == 0)) {
			int temp[] = new int[arrOneD.length - 2];
			int j = 0;
			for (int i = 0; i < arrOneD.length; i++) {
				if (!(i == 0) && !(i == arrOneD.length - 1)) {

					temp[j] = arrOneD[i];
					j++;
				}
			}
			return temp;
		} else
			return null;
	}

	// Function that returns a new array without the first and last element
	// using copy of element method
	public int[] returnMiddleArrayCopyOfMethod(int arrOneD[]) {
		return Arrays.copyOfRange(arrOneD, 1, arrOneD.length - 1);
	}

	// Function to add diagonal values of a 2DArray
	public int sumDiagonal(int[][] a) {
		try {
			int sum = 0;

			for (int i = 0; i < a.length; i++) {
				sum += a[i][i];
			}
			return sum;
		} catch (Exception e) {
			System.out.println("Array is not a square one");
			return 0;
		}

	}

	// Function to return top 2 scores in 1DArray using Sorting
	public void getTopTwoScore(int[] a) {
		int firstScore = 0;
		int secondScore = 0;
		Arrays.sort(a);
		firstScore = a[a.length - 1];
		secondScore = a[a.length - 2];
		System.out.println("Top scores are " + firstScore + " and " + secondScore);
	}

	// Function to return top 2 scores in 1DArray without Sorting
	public void getTopTwoScoreWithoutSorting(int[] a) {
		int firstScore = 0;
		int secondScore = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		firstScore = a[a.length - 1];
		secondScore = a[a.length - 2];
		System.out.println("Top scores are " + firstScore + " and " + secondScore);
	}

	// My solution to remove duplicate numbers from Array using Array
	public void removeDuplicateFromArray(int[] a) {

		int m = a.length;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Total length of m " + m);

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j])) {
					a[j] = Integer.MIN_VALUE;
				}
			}
			if ((a[i] == Integer.MIN_VALUE)) {
				m--;
			}

		}
		int temp[] = new int[m];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (!(a[i] == Integer.MIN_VALUE)) {
				temp[j++] = a[i];
			}
		}

		System.out.println(m);
		System.out.println(Arrays.toString(temp));
	}

}
