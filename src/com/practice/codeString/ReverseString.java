package com.practice.codeString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		try (Scanner input = new Scanner(System.in)) {
			String str = input.nextLine();
			
		String reverseString=reverseString(str);
		System.out.println(reverseString);
			
		}

	}


	private static String reverseString(String str) {
		String revStr="";
		for (int i = str.length()-1; i >=0; i--) {
			revStr=revStr+str.charAt(i);
		}
		return revStr;
	}

}
