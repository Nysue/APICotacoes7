
package com.company.boostcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {
    public void main() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 1. 기존 문자열 입력받기
            String base = br.readLine();

            // 2. 입력받은 기존 문자열 스택에 담기
            Stack<Character> stack = new Stack<>();
            Stack<Character> stack_R = new Stack<>();

            for (int i = 0; i < base.length(); i++) {
                stack.push(base.charAt(i));
            }

            // 3. 명령 수 입력받고 명령 저장할 스택 생성
            int sq_num = Integer.parseInt(br.readLine());

            // 4. 명령 수 만큼 입력받은 뒤 스택에 저장
            while (sq_num-- > 0) {
                String cmd = br.readLine();
                //5-1. L일 경우
                if (cmd.equals("L")) {
                    if (!stack.empty()) {
                        stack_R.push(stack.pop());
                    }
                //5-2. D일 경우
                } else if (cmd.equals("D")) {
                    if (!stack_R.empty()) {
                        stack.push(stack_R.pop());
                    }
                // 5-3. B일 경우
                } else if (cmd.equals("B")) {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                // 5-4. P$일 경우
                } else if (cmd.contains("P")) {
                    char x = cmd.charAt(2);
                    stack.push(x);
                }
            }

            // 문자열로 만들기 위해 합친다.
            while (!stack.empty()) {
                stack_R.push(stack.pop());
            }

            StringBuilder sb = new StringBuilder();
            while (!stack_R.empty()) {
                sb.append(stack_R.pop());
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}