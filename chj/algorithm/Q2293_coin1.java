package com.company.boostcamp;

import java.util.Scanner;

public class Q2293_coin1 {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int coinNumber = scanner.nextInt();
        int targetPrice = scanner.nextInt();
        int[] coinPrice = new int[coinNumber + 1];
        int