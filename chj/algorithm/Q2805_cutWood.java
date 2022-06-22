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
    