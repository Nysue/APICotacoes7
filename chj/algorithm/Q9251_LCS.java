package com.company.boostcamp;

import java.util.Scanner;

public class Q9251_LCS {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        int[][] matrix = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i < a.length() + 1; i++) {
            for (int j = 0; j < b.length() + 1; j++) {
                if (i == 0 || j == 0) matrix[i][j] = 0;
                else if (a.charAt(i - 1) == b.charAt(j - 1)) matrix[i][j] = matrix[i - 1][j - 1] + 1;
                else if (a.charAt(i - 1) != b.charAt(j - 1)) matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }

        System.out.println(matrix[a.length()][b.length()]);
    }

}
