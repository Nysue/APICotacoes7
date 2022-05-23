
package com.company.boostcamp;

import java.util.BitSet;
import java.util.Scanner;

public class Q1931_meetingRoom {
    private int N;
    private int[][] meetingTime;
    private BitSet mask;
    private int count;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        mask = new BitSet((int) Math.pow(2, 30));
        N = scanner.nextInt();
        meetingTime = new int[N][2];
        count = 0;

        for (int i = 0; i < N; i++) {
            meetingTime[i][0] = scanner.nextInt();
            meetingTime[i][1] = scanner.nextInt();
        }

        dpf(1, true);
        dpf(1, false);

        System.out.println(count);
    }

    private void dpf(int depth, boolean flag) {
        if (depth > N) return;
        else {
            int start = meetingTime[depth - 1][0];
            int end = meetingTime[depth - 1][1];

            if (flag) {
                BitSet bs = new BitSet((int) Math.pow(2, 30));
                bs.set(start, end);
                BitSet tmp = (BitSet) bs.clone();

                // 회의실 대여가 가능한지 확인
                /*for(int i = start; i <= end; i ++) {
                    if(mask[i] >= 1) return;
                }*/

                // 회의실 대여가 가능한지 확인
                tmp.and(mask);
                if (tmp.isEmpty()) {
                    // 대여가 가능한 경우
                    count++;
                    mask.or(bs);
                    System.out.println(String.format("start : %d, end : %d, count : %d", start, end, count));
                    bs = tmp = null;
                } else {
                    // 대여가 불가능한 경우
                    return;
                }

                // 회의실 대여가 가능하다면 1로 채운다
                /*for (int i = start; i <= end; i++) {
                    mask[i]++;
                }
                count++;*/
            }

            // 다음 회의를 포함한 경우
            dpf(depth + 1, true);
            dpf(depth + 1, false);
        }
    }
}