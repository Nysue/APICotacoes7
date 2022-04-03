
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