package com.company.boostcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1946_neeEmployee {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            ArrayList<Rank> ranking = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ranking.add(new Rank(scanner.nextInt(), scanner.nextInt()));
            }
