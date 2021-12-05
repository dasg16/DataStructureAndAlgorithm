package com.das.arrays;

public class MaxProduct {
	public static void main(String[] args) {
		int arrOneD[] = { 2, 49, 66, 23, 21, 54, 33, 91, 93, 66, 21, 49 };

		MaxProduct maxProduct = new MaxProduct();
		maxProduct.printMaxProduct(arrOneD);
	}

	public void printMaxProduct(int arrOneD[]) {
		int maxProduct = 1;
		int multiplyValue;
		for (int i = 0; i < arrOneD.length; i++) {
			for (int j = i + 1; j < arrOneD.length; j++) {
				multiplyValue = arrOneD[i] * arrOneD[j];
				if (multiplyValue > maxProduct) {
					maxProduct = multiplyValue;
				}
			}
		}
		System.out.println(maxProduct);
	}
}
