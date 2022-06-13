package com.company.boostcamp;

import java.util.Scanner;

public class Q2293_coin1 {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int coinNumber = scanner.nextInt();
        int targetPrice = scanner.nextInt();
        int[] coinPrice = new int[coinNumber + 1];
        int[] counts = new int[targetPrice + 1];

        for (int i = 1; i <= coinNumber; i++) {
            coinPrice[i] = scanner.nextInt();
        }

        // N = 3, prices = [1, 2, 5], targetPrice = 10
        // 0 : 0
        // 1 : (0)+1
        // 2 : (1)+1, (0)+2
        // 3 : (1+1)+1, (1)+2
        // 4 : (1+1+1)+1, (1+1)+2, (2)+2
        // 5 : (1+1+1+1)+1, (1+1+1)+2, (1+2)+2, (0)+5
      