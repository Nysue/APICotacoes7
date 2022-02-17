
package com.company.boostcamp;

import java.util.Scanner;

public class Q10808_alphabetNumber {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        final int alphabetNumber = 26;
        final int constant = 97;
        int[] counts = new int[alphabetNumber];

        for (int i = 0; i < word.length(); i++) {
            int asciiCode = (int) word.charAt(i);
            int index = asciiCode - constant;
            if (0 <= index && index <= alphabetNumber - 1) counts[index] += 1;
        }

        for (int i = 0; i < counts.length - 1; i++) {
            System.out.print(counts[i] + " ");
        }
        System.out.print(counts[alphabetNumber - 1]);
    }
}