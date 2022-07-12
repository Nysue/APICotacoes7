package com.company.boostcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {
    public void main() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        try {
            int instructions = Integer.parseInt(br.readLine());

            for (int i = 0; i < instructions; i++) {
                String instruction = br.readLine();
                boolean balance = true;

                for (int j = 0; j < instruction.length(); j++) {
                    if (instruction.charAt(j) == '(') {
                        stack.push('(');
                    } else if (instruction.charAt(j) == ')') {
                        if (stack.empty()) {
                            balance = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                }

                if (balance && stack.empty()) System.out.println("YES");
                else System.out.println("NO");
                stack.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
