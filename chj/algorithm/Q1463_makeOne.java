
package com.company.boostcamp;

import java.util.Scanner;

public class Q1463_makeOne {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(10);
        // 입력은 최대 10^6이므로
        int N = 1000001;
        int[] solution = new int[N];

        solution[0] = solution[1] = 0;
        for (int i = 2; i <= input; i++) {
            // 1을 더하는 경우
            solution[i] = solution[i - 1] + 1;