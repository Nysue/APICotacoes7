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

        for(int i=0; i < input.