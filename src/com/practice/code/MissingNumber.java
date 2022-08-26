package com.practice.code;

import java.util.Iterator;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6 };
		int sum = 0, temp = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < 6; i++) {
			temp += i + 1;
		}
		System.out.println(temp-sum);
	}

}
