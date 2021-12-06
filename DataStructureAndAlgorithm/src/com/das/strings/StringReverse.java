package com.das.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String first = scan.nextLine();
		// stringReverse.reverseString(first);
		// stringReverse.reverseStringBuffer(first);
		// stringReverse.stringWordReverse(first);
		System.out.println(stringReverse.reverseStringRecursion(first));
	}

	public void reverseString(String first) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = first.length() - 1; i >= 0; i--) {
			result = result + first.charAt(i);
		}
		System.out.println(result);
	}

	public void reverseStringBuffer(String first) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(first);
		System.out.println(sb.reverse());
	}

	public String reverseStringRecursion(String first) {
		// TODO Auto-generated method stub
		if (first.isEmpty()) {
			return first;
		}
		// Calling Function Recursively
		return reverseStringRecursion(first.substring(1)) + first.charAt(0);
	}

	public void stringWordReverse(String first) {
		String temp[] = first.split(" ");
		String result = "";
		System.out.println(Arrays.toString(temp));
		for (int i = temp.length - 1; i >= 0; i--) {

			if (!result.equalsIgnoreCase("")) {
				result = result + " " + temp[i];
			} else {
				result = result + temp[i];
			}
		}
		System.out.println(result);
	}

}
