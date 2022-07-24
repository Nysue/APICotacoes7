package com.company.boostcamp;

import java.util.Scanner;

public class Q9251_LCS {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        int[][] matrix = new int[a.length() + 1][b.length() + 1];

       