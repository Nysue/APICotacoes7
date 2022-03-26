package com.company.boostcamp;

import java.util.Scanner;

public class Q10844_easyStepNumber {
    /*private int N;
    private int dp;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        for(int i=1; i<=9; i++) dpf(1, i);

        System.out.println(dp);
    }

    private void dpf(int length, int selected) {
        if (length == N) dp++;
        else {
            if (selected > 0) dpf(length + 1, selected - 1);
            if (selected < 9) dpf(length + 1, selected + 1);
        }
    }*/


    /*private int N;
    private int[][] dp;

    public void main() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        dp = new int[N + 1][10];

        // 길이가 1인 경우
        for (int i = 1; i <= 9; i++) dp[1][i] = 1;

        // dp를 채운다
        for (int i = 0; i <= 9; i++) {
            dpf(2, i);
        }

        // 길이가 N인 경우의 수를 합한다.
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += dp[N][i];
        }
        System.out.println(sum);
    }

    private void dpf(int length, int last) {
        if (le