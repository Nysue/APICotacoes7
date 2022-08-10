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

        System.out.println(count);
    }

    // 임의의 열에 퀸을 배치한 row에 대해, promising한지 검사합니다
    private void queen(int row) {
        // 배치된 퀸이 다른 퀸과 충돌하는 경우
        if (!promising(row)) return;

        // 다른 퀸과 충돌하지 않으면서, 마지막 행에 퀸을 배치한 경우
        if (row == N) {
            // 해당 노드가 해에 해당하는 경우, 각 퀸의 위치를 출력합니다.
            for (int i = 1; i <= N; i++) {
                System.out.println(String.format("[%d, %d]", i, cols[i]));
            }
            count++;
        } else {
            for (int i = 1; i <= N; i++) {
                // 현재 행까지는 배치가 완료되었으며, 다음 행에 임의로 배치 후 promising한지 검사합니다
                cols[row + 1] = i;
                queen(row + 1);
   