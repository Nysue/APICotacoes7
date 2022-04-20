
package com.company.boostcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1158_josephus {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        // get arguments
        int N = scanner.nextInt();
        int step = scanner.nextInt();

        // make circular queue
        int[] circularQ = new int[N];
        for (int i = 0; i < N; i++) {
            circularQ[i] = i + 1;
        }

        // make josephus permutation
        ArrayList<Integer> josephus = new ArrayList<>();

        int index = -1;
        while (josephus.size() != N) {
            int tmpStep = step;

            // find next index
            while (tmpStep > 0) {
                index++;
                if (index >= N) index = 0;
                if (circularQ[index] != -1) {
                    tmpStep--;
                }
            }

            // get target
            int target = circularQ[index];
            josephus.add(target);
            // mark -1
            circularQ[index] = -1;
        }

        // print result
        System.out.print("<");
        for (int i = 0; i < josephus.size(); i++) {
            if (i == josephus.size() - 1) System.out.print(josephus.get(i));
            else System.out.print(josephus.get(i) + ", ");
        }
        System.out.print(">");
    }
}