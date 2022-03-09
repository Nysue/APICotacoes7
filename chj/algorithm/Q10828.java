
package com.company.boostcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Q10828 {
    void main() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> stack = new ArrayList<>();

        try {
            int instructions = Integer.parseInt(br.readLine());

            for (int i = 0; i < instructions; i++) {
                String[] instruction = br.readLine().split("\\s+");
                switch (instruction[0]) {
                    case "push": {
                        stack.add(Integer.parseInt(instruction[1]));
                        break;
                    }
                    case "pop": {
                        int index = stack.size() - 1;
                        if (index == -1) {
                            System.out.println(-1);
                        } else {
                            int popped = stack.get(index);
                            stack.remove(index);
                            System.out.println(popped);
                        }
                        break;
                    }
                    case "size": {
                        System.out.println(stack.size());
                        break;
                    }
                    case "empty": {
                        if (stack.isEmpty()) System.out.println(1);
                        else System.out.println(0);
                        break;
                    }
                    case "top": {
                        int index = stack.size() - 1;
                        if (index == -1) {
                            System.out.println(-1);
                        } else {
                            int popped = stack.get(index);
                            System.out.println(popped);
                        }
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}