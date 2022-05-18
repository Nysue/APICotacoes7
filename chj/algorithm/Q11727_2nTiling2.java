package com.company.boostcamp;

import java.util.Scanner;

public class Q11727_2nTiling2 {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] counts = new int[1001];

        counts[0] = 1;
        counts[1] = 3;
        for (int i = 2; i < n; i++) {
            // d(n) = d(n-1) + 2d(n-2)
            counts[i] = (counts[i - 1] + 2 * counts[i - 2]) % 10007;
        }

        System.out.println(counts[n - 1]);
    }
}
