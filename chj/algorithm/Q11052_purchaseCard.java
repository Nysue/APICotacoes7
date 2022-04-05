
package com.company.boostcamp;

import java.util.Scanner;

public class Q11052_purchaseCard {
    /*private int N;
    private int maxPrice;
    private int[] prices;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        // 카드 개수와 가격을 설정
        N = scanner.nextInt();
        prices = new int[N + 1];
        for (int i = 1; i <= N; i++) prices[i] = scanner.nextInt();

        // 최대 가격을 찾는다
        purchase(0, 0);

        // 최대 가격을 출력
        System.out.println(maxPrice);
    }

    private void purchase(int cardNumber, int price) {
        // 카드 개수를 초과한 경우
        if (cardNumber > N) return;

        // 현재까지의 최대 가격보다 더 높은 가격이라면, 최대 가격을 업데이트
        if (maxPrice < price) maxPrice = price;

        // 카드팩 추가 구매
        for (int i = 1; i <= N; i++) purchase(cardNumber + i, price + prices[i]);
    }*/

    public void main() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] price = new int[N + 1];
        int[] maxPrice = new int[N + 1];

        price[0] = maxPrice[0] = 0;
        for (int i = 1; i <= N; i++) {
            price[i] = scanner.nextInt();
        }

        // 점화식 : D(n) = D(n-i) + P(i), i = [1, n]
        // D : 최대 가격, P : 카드팩의 가격, n : 사고자 하는 카드의 개수
        // i = n인 경우는, n개 들이 카드팩을 하나만 사는 경우 (재귀적이지 않은 경우)
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                // 재귀적이지 않은 경우와 재귀적인 경우를 비교하여, 최대값을 구한다.
                // 근데 왜 재귀적인 경우 끼리는 비교하지 않는걸까..
                int max = Math.max(price[i], maxPrice[i - j] + price[j]);
                if (maxPrice[i] < max) maxPrice[i] = max;
            }
        }

        System.out.println(maxPrice[N]);
    }
}