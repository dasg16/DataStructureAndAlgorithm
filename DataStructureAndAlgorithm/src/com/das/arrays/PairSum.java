package com.das.arrays;

public class PairSum {
	public static void main(String[] args) {
		PairSum pairSum = new PairSum();
		int arr[] = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		String result = pairSum.pairNumbers(arr, 7);
		System.out.println(result);
	}

	public String pairNumbers(int arr[], int value) {
		int sum = 0;
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == value) {
					result = result + " " + arr[i] + " : " + arr[j] + " ";
				}
			}
		}
		if (!result.equalsIgnoreCase("")) {
			return result;
		} else {
			return "No records with the same sum exists ";

		}
	}
}
