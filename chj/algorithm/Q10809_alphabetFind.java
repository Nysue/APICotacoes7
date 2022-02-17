
package com.company.boostcamp;

import java.util.Scanner;

public class Q10809_alphabetFind {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        final int alphabetNumber = 26;
        final int constant = 97;
        int[] counts = new int[alphabetNumber];
        for(int i=0; i<counts.length; i++) counts[i] = -1;

        for (int i = 0; i < word.length(); i++) {
            // get character's ascii code
            int asciiCode = (int) word.charAt(i);
            // get counts's index corresponding ascii code
            int index = asciiCode - constant;
            // set first appearance index
            if (0 <= index && index <= alphabetNumber - 1) {
                if(counts[index] == -1) counts[index] = i;
            }
        }

        for (int i = 0; i < counts.length - 1; i++) {
            System.out.print(counts[i] + " ");
        }
        System.out.print(counts[alphabetNumber - 1]);
    }
}