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
       