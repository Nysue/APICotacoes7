package com.company.boostcamp;

import java.util.Arrays;
import java.util.Scanner;

// 참고 : https://real-dongsoo7.tistory.com/38
// 진심 좆같은 문제..

public class Q11066_mergeFile {
    private int[][] dp;
    private int[] chapters;
    private int[] sum;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scan