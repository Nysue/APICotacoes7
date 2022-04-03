
package com.company.boostcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q10845 {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        // get instruction number
        int n = scanner.nextInt();

        // make queue
        ArrayList<Integer> queue = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // parse instruction
            String instruction = scanner.next();

            switch (instruction) {
                case "push": {
                    int argument = scanner.nextInt();
                    queue.add(argument);
                    break;
                }
                case "pop": {
                    if (queue.size() > 0) {
                        System.out.println(queue.remove(0));
                    } else {
                        System.out.println(-1);
                    }
                    break;
                }
                case "size": {
                    System.out.println(queue.size());
                    break;
                }
                case "empty": {
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                }
                case "front": {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.get(0));
                    }
                    break;
                }
                case "back": {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.get(queue.size() - 1));
                    }
                    break;
                }
            }
        }

    }
}