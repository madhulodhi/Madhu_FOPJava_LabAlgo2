package com.greatlearning.lab2;
import java.util.*;

public class TravellerPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations:");
        int size = scanner.nextInt();

        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations value:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        Arrays.sort(denominations); // Sort the denominations in ascending order

        Map<Integer, Integer> paymentApproach = new HashMap<>();

        for (int i = size - 1; i >= 0; i--) {
            int denomination = denominations[i];
            int notesNeeded = amount / denomination;

            if (notesNeeded > 0) {
                paymentApproach.put(denomination, notesNeeded);
                amount = amount % denomination;
            }
        }

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (Map.Entry<Integer, Integer> entry : paymentApproach.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

