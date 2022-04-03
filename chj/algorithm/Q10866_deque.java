
package com.company.boostcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10866_deque {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> deque = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            // get instruction
            String instruction = scanner.next();

            switch (instruction) {
                case "push_front": {
                    int argument = scanner.nextInt();
                    deque.add(0, argument);
                    break;
                }
                case "push_back": {
                    int argument = scanner.nextInt();
                    deque.add(argument);
                    break;
                }
                case "pop_front": {
                    if (deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.remove(0));
                    break;
                }
                case "pop_back": {
                    if (deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.remove(deque.size() - 1));
                    break;
                }
                case "size": {
                    System.out.println(deque.size());
                    break;
                }
                case "empty": {
                    if (deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front": {
                    if (deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.get(0));
                    break;
                }
                case "back": {
                    if (deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.get(deque.size() - 1));
                    break;
                }
            }
        }
    }
}