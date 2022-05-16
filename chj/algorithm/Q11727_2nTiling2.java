package com.company.boostcamp;

import java.util.Scanner;

public class Q11727_2nTiling2 {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] counts = new int[1001];

        counts[0] = 1;
        counts[1] = 3