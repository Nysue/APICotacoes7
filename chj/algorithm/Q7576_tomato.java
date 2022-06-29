
package com.company.boostcamp;

import java.util.LinkedList;
import java.util.Scanner;

public class Q7576_tomato {
    LinkedList<Tomato> ripenTomato;
    LinkedList<Tomato> queue;

    int width;
    int height;
    int[][] tomatoBox;

    int day;
    int count;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        ripenTomato = new LinkedList<>();
        queue = new LinkedList<>();

        width = scanner.nextInt();
        height = scanner.nextInt();
        tomatoBox = new int[height][width];

        for (int i = 0; i < height; i++) {
            System.out.print("[");
            for (int j = 0; j < width; j++) {
                tomatoBox[i][j] = scanner.nextInt();
                if (tomatoBox[i][j] == 1) {
                    queue.add(new Tomato(i, j));
                    tomatoBox[i][j] = 0;
                }
                System.out.print(tomatoBox[i][j] + " ");
            }