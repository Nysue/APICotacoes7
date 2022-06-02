
package com.company.boostcamp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2110_modemInstall2 {
    int houseNumber;
    int[] houses;
    int distance;
    int modemNumber;
    LinkedList<MyNode> queue;

    public void main(){
        Scanner scanner = new Scanner(System.in);

        houseNumber = scanner.nextInt();
        modemNumber = scanner.nextInt();
        houses = new int[houseNumber];
        for(int i=0; i<houseNumber; i++) houses[i] = scanner.nextInt();
        Arrays.sort(houses);

        // 양 끝 집에 공유기를 설치
        modemNumber -= 2;

        // 이진 탐색 호출
        queue = new LinkedList<>();
        queue.add(new MyNode(0, houseNumber-1));
        binarySearch();

        System.out.println(distance);