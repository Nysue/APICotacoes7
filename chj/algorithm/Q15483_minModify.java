
package com.company.boostcamp;

import java.util.Scanner;

public class Q15483_minModify {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int[][] matrix = new int[a.length()+1][b.length()+1];
        for (int i = 0; i <= a.length(); i++) matrix[i][0] = i;
        for (int j = 0; j <= b.length(); j++) matrix[0][j] = j;

        // fill the edit distance matrix
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) matrix[i][j] = matrix[i - 1][j - 1];
                else matrix[i][j] = Math.min(matrix[i - 1][j], Math.min(matrix[i - 1][j - 1], matrix[i][j - 1])) + 1;
            }
        }

        System.out.println(matrix[a.length()][b.length()]);
    }
}