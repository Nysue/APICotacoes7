
package com.company.boostcamp;

import java.util.Scanner;

public class Q11726_2nTiling {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] counts = new int[1001];

        counts[0] = 1;
        counts[1] = 2;
        for (int i = 2; i < n; i++) {
            // d(n) = d(n-1) + d(n-2)
            counts[i] = (counts[i - 1] + counts[i - 2]) % 10007;
        }

        System.out.println(counts[n - 1]);
    }
}