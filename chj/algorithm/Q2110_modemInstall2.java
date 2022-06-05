
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
    }

    private void binarySearch(){
        MyNode myNode = queue.removeFirst();
        int left = myNode.left;
        int right = myNode.right;

        if(left > right || modemNumber <= 0) return;

        // 중간 지점 계산
        int middlePoint = (houses[left] + houses[right]) / 2;

        // 중간 지점과 가장 가까운 집의 인덱스를 구한다
        int middleIndex = nearestHouse(left, right, middlePoint);

        // 공유기를 설치할 집 좌우로, 가장 가까운 거리를 계산한다
        System.out.println(String.format("left:%d, right:%d, middle:%d, modem:%d, distance: %d %d",left,right,middleIndex, modemNumber, houses[middleIndex] - houses[left], houses[right] - houses[middleIndex]));
        int newDistance = Math.min(houses[middleIndex] - houses[left], houses[right] - houses[middleIndex]);
        if(newDistance < distance) distance = newDistance;

        // 공유기를 설치하고, BFS를 한다.
        modemNumber--;
        queue.add(new MyNode(middleIndex, right));
        queue.add(new MyNode(left, middleIndex));
        binarySearch();
    }

    private int nearestHouse(int start, int end, int point) {
        int index = 0;
        int distance = Integer.MAX_VALUE;

        while(start <= end) {
            int middle = (start + end) / 2;

            int middlePoint = houses[middle];
            int gap = Math.abs(point - middlePoint);
            if(distance > gap) {
                distance = gap;
                index = middle;
            }
            if(point >= middlePoint) start = middle + 1;
            else if(point < middlePoint) end = middle -1;
        }

        return index;
    }

    public class MyNode{
        public int left;
        public int right;

        public MyNode(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}