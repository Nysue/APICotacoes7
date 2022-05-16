package com.company.boostcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q11655_ROT13 {
    public void main() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int LARGE_A = 65;
        final int LARGE_Z = 90;
        final int SMALL_A = 97;
        final int SMALL_Z = 122;

        try {
            StringBuilder string = new StringBuilder(br.readLine());

            for (int i = 0; i < string.length(); i++) {
                int ascii = string.charAt(i);

                // if large alphabet
                if (LARGE_A <= ascii && ascii <= LARGE_Z) {
                    if (ascii + 13 > LARGE_Z) string.setCharAt(i, (char) (LARGE_A + (ascii + 13 - LARGE_Z - 1)));
                    else string.setCharAt(i, (char) (ascii + 13));
                // if small alphabet
                } else if (SMALL_A <= ascii && ascii <= SMALL_Z) {
                    if (ascii + 13 > SMALL_Z) string.setCharAt(i, (char) (SMALL_A + (ascii + 13 - SMALL_Z - 1)));
                    else string.setCharAt(i, (char) (ascii + 13));
                }
            }
            System.out.println(string.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
