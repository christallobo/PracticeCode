package com.practice.collection;

import java.util.Scanner;

public class PatientQueue {

	public static int MAX = 5;
	public static String queue[] = new String[50];
	public static int last = -1, i;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int ch;

		System.out.println("\n1-Insert \n2-delete\n3-display\n4-Exit\n");
		while (true) {
			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}

	}

	private static void display() {
		if (last == -1) {
			System.out.println("No Patient");
		} else {
			System.out.println("Patients in queue(appointment) are:");
			for (int i = 0; i <= last; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	private static void delete() {
		if (last == -1) {
			System.out.println("No Patient");
		} else {
			System.out.println("The aptient consulted is " + queue[0]);
			for (int i = 0; i < last; i++) {
				queue[i] = queue[i + 1];
			}
			last--;
		}
	}

	private static void insert() {
		if (last == MAX - 1) {
			System.out.println("Appointments are full");
		} else {
			System.out.println("Patient to be consulted");
			queue[++last] = sc.next();
			System.out.println("Patient booked the appointment");
		}
	}

}
