package com.company.boostcamp;

import java.util.Scanner;

public class Q9095_123add {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        int[] counts = new int[12];

        // make solution array
        counts[0] = 0;
        counts[1] = 1;
        counts[2] = 2;
        counts[3] = 4;
        for (int i = 4; i < 12; i++) {
            counts[i] = counts[i - 1] + counts[i - 2] + counts[i - 3];
        }

        // print solution
        for(int i=0;i<testCases; i++){
            System.out.println(counts[scanner.nextInt()]);
        }
    }
}
