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
        }
    }

    private boolean binarySearch(int targetIndex, int start, int end) {
        if (start > end) return false;

        int middle = (start + end) / 2;

        if (set[middle] == target[targetIndex]) return true;
        else if (target[targetIndex] < set[middle]) return binarySearch(targetIndex, start, middle - 1);
        else if (set[middle] < target[targetIndex]) return binarySearch(targetIndex, middle + 1, end);
        return false;
    }
}
