package com.company.boostcamp;

import java.util.Scanner;

public class Q9663_nQueen {
    private int N;
    private int[] cols;
    private int count;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        cols = new int[N + 1];
        count = 0;

        queen(0);

        System.o