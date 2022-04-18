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
            int N = scanner.nextInt();
            dp = new int[N + 1][N + 1];

            chapters = new int[N + 1];
            sum = new int[N + 1];
            chapters[0] = sum[0] = 0;
            for (int i = 1; i <= N; i++) {
                chapters[i] = scanner.nextInt();
                sum[i] += sum[i - 1] + chapters[i];
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }

            System.out.println(dpf(1, N));
        }
    }

    private int dpf(int start, int end) {
        // 동일한 챕터를 묶는 경우
        if (start >= end) return dp[start][end] = 0;

        // 연속한 두 챕터를 묶는 경우
        if (start + 1 == end) return dp[start][end] = chapters[start] + chapters[end];

        // 3챕터 이상을 묶는 경우
        for (int pivot = start; pivot < end; pivot++) {
            int left = dpf(start, pivot);
            int right = dpf(pivot + 1, end);
            // 왼쪽 부분에 대한 값 + 오른쪽 부분에 대한 값 + start에서 end까지 누적합
            dp[start][end] = Math.min(dp[start][end], left + right + sum[end] - sum[start - 1]);
        }

        return dp[start][end];
    }
}
