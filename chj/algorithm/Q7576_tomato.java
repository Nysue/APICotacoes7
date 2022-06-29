
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
            System.out.println("]");
        }

        // 모든 토마토가 완숙이면 0을 출력
        if(checkTomato()) System.out.println(0);

        day = -1;
        count = ripenTomato.size() + queue.size();
        BFS();

        // 미숙 토마토가 존재하는지 확인한다.
        if (checkTomato()) System.out.println(day);
        else System.out.println(-1);
    }

    public void BFS() {
        // 더 이상 확인할 토마토가 없는 경우
        if (queue.isEmpty()) return;

        // 확인할 토마토를 얻는다
        Tomato tomato = queue.poll();
        int x = tomato.x;
        int y = tomato.y;
        System.out.println(String.format("tomatoBox[%d][%d] = %d", x, y, tomatoBox[x][y]));

        // 해당 토마토가 미숙인 경우
        if (tomatoBox[x][y] == 0) {
            // 토마토를 완숙으로 표시한다
            tomatoBox[x][y] = 1;
            ripenTomato.add(new Tomato(x, y));

            // 주변 토마토를 큐에 넣는다
            if (x > 0 && tomatoBox[x - 1][y] != 1) {
                queue.add(new Tomato(x - 1, y));
//                System.out.println(String.format("add tomatoBox[%d][%d]", x - 1, y));
            }
            if (y < width - 1 && tomatoBox[x][y + 1] != 1) {
                queue.add(new Tomato(x, y + 1));
//                System.out.println(String.format("add tomatoBox[%d][%d]", x, y + 1));
            }
            if (x < height - 1 && tomatoBox[x + 1][y] != 1) {
                queue.add(new Tomato(x + 1, y));
//                System.out.println(String.format("add tomatoBox[%d][%d]", x + 1, y));
            }
            if (y > 0 && tomatoBox[x][y - 1] != 1) {
                queue.add(new Tomato(x, y - 1));
//                System.out.println(String.format("add tomatoBox[%d][%d]", x, y - 1));
            }
        }
        else count--;

        // 날이 지났는지 확인한다
        if (ripenTomato.size() == count) {
            day++;
            if(!checkTomato()) count = ripenTomato.size() + queue.size();
            System.out.println(String.format("x : %d, y : %d, day : %d", x, y, day));
            for (int i = 0; i < height; i++) {
                System.out.print("[");
                for (int j = 0; j < width; j++) {
                    System.out.print(tomatoBox[i][j] + " ");
                }
                System.out.println("]");
            }
        }

        // 탐색은 비어있던, 완숙이던, 미숙이던 진행한다.
        BFS();
    }

    public boolean checkTomato() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (tomatoBox[i][j] == 0) return false;
            }
        }
        return true;
    }

    public class Tomato {
        int x;
        int y;

        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}