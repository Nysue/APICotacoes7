package com.company.boostcamp;

import java.util.Scanner;

public class Q2293_coin1 {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int coinNumber = scanner.nextInt();
        int targetPrice = scanner.nextInt();
        int[] coinPrice = new int[coinNumber + 1];
        int[] counts = new int[targetPrice + 1];

        for (int i = 1; i <= coinNumber; i++) {
            coinPrice[i] = scanner.nextInt();
        }

        // N = 3, prices = [1, 2, 5], targetPrice = 10
        // 0 : 0
        // 1 : (0)+1
        // 2 : (1)+1, (0)+2
        // 3 : (1+1)+1, (1)+2
        // 4 : (1+1+1)+1, (1+1)+2, (2)+2
        // 5 : (1+1+1+1)+1, (1+1+1)+2, (1+2)+2, (0)+5
        // 6 : (1+1+1+1+1)+1, (1+1+1+1)+2, (1+1+2)+2, (2+2)+2, (1)+5

        // d(i, k) = d(i-1, k)                  if c(i) > k    i번째 코인을 이용하여 k를 표현할 수 없다.
        //         = d(i, k-c(i)) + d(i-1, k)   if c(i) <= k   i번째 코인을 이용하여 k를 표현할 수 있다.
        // d : i번째 코인으로 k를 만드는 경우의 수
        // c : i번째 코인의 가치

        // k=5인 경우
        // d(1, 5) = d(1, 5-1) + d(0, 5) => (1+1+1+1)+1의 경우 + 0번째 코인은 존재하지 