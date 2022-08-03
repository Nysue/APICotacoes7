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
