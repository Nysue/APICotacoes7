package com.company.boostcamp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1920_findNumber {
    int[] set;
    int[] target;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        set = new int[N];
        for (int i = 0; i < N; i++) set[i] = scanner.nextInt();
        Arrays.sort(set);

        int M = scanner.nextInt();
        target = new int[M];
        for (int i = 0; i < M; i++) target[i] = scanner.nextInt();

        for (int i = 0; i < M; i++) {
            if(binarySearch(i, 0, N-1)) System.out.println("1");
            else System.out.println("0");
 