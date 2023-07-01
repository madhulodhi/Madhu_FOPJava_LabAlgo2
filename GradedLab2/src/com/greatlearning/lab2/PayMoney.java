package com.greatlearning.lab2;
import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of transaction array:");
		int size = scanner.nextInt();

		int[] transactions = new int[size];

		System.out.println("Enter the values of the array:");
		for (int i = 0; i < size; i++) {
			transactions[i] = scanner.nextInt();
		}

		System.out.println("Enter the total number of targets that need to be achieved:");
		int numTargets = scanner.nextInt();

		for (int t = 1; t <= numTargets; t++) {
			System.out.println("Enter the value of target:");
			int target = scanner.nextInt();

			int sum = 0;
			int transactionsNeeded = 0;

			for (int i = 0; i < size; i++) {
				sum += transactions[i];
				transactionsNeeded++;

				if (sum >= target) {
					System.out.println("Target achieved after " + transactionsNeeded + " transactions");
					break;
				}
			}

			if (sum < target) {
				System.out.println("Target is not achieved");
			}
		}
	}
}

