package com.das.strings;

import java.util.Scanner;

public class General {
	public static void main(String[] args) {
		General general = new General();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String first = scan.nextLine();
		String second = scan.nextLine();
		general.cases(first, second);
	}

	public void cases(String first, String second) {
		System.out.println(first.toUpperCase());
		System.out.println(first.compareTo(second));
		System.out.println(first.concat(second));

	}

}
