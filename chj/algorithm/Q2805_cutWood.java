package com.company.boostcamp;

import java.util.Scanner;

public class Q2805_cutWood {
    int N;
    int[] woods;
    int height;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        // 나무의 개수
        N = scanner.nextInt();
        // 원하는 길이
        int length = scanner.nextInt();
        // 최적의 높이
        height = 0;
        // 이진탐색 호출을 위한 최대 높이
        int maxHeight = 0;
        // 나무 배열
        woods = new int[N];
        for (int i = 0; i < N; i++) {
            woods[i] = scanner.nextInt();
            if (woods[i] > maxHeight) maxHeight = woods[i];
        }
        binarySearch(length, 0, maxHeight);

        System.out.println(height);
    }

    private void binarySearch(int length, int start, int end) {
        if (start > end) return;

        int middle = (start + end) / 2;

        // 잘려진 길이를 구한다
        int remain = 0;
        for (int i = 0; i < N; i++) if (woods[i] > middle) remain += woods[i] - middle;

        System.out.println(String.format("length : %d, remain : %d, %d~%d~%d, height : %d", length, remain, start,middle, end,height));

        if (length <= remain) {
            height = middle;
            binarySearch(length, middle + 1, end);
        } else if (remain < length) {
            binarySearch(length, start, middle - 1);
        }
    }
}
