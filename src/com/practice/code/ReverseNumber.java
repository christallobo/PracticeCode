package com.practice.code;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 12345, n1 = 0;
		String temp = "";

		while (num > 0) {
			n1 = num % 10;
			num = num / 10;
			temp += n1;
		}
		System.out.println(temp);
	}

}
