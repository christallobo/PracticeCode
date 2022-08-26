package com.practice.codeString;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCollection {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		removeDuplicateChar(str);
	}

	private static void removeDuplicateChar(String str) {
		LinkedHashSet<Character> list = new LinkedHashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		for (Character character : list) {
			System.out.print(character);
		}

	}
}
