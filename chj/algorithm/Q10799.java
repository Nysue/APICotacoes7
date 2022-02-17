package com.company.boostcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Q10799 {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        Stack<Character> stack = new Stack<>();
        int sticks = 0;
        // need to memorize before character
        char before = ' ';

        for(int i=0; i < input.length(); i++){
            char c = input.charAt(i);

            switch(c){
                case '(':{
                    // push
                    stack.push('(');
                    before = '(';
                    break;
                }
                case ')':{
                    // if laser
                    // parenthesis must be balanced, don't need to check stack is empty
                    if(before == '(') {
                        stack.pop();
                        sticks += stack.size();
                        before = ')';
                    }
                    // if end of stick
                    else {
                        stack.pop();
                        sticks++;
                        before = ')';
                    }
                    break;
                }
            }
        }
        System.out.println(sticks);
    }
}
