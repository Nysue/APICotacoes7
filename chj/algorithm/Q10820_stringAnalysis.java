package com.company.boostcamp;

import org.xml.sax.SAXParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q10820_stringAnalysis {
    public void main() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int SPACE = 32;
        final int LARGE_A = 65;
        final int LARGE_Z = 90;
        final int SMALL_A = 97;
        final int SMALL_Z = 122;
        final int ZERO = 48;
        final int NINE = 57;

        int spaceCounts = 0;
        int largeCounts = 0;
        int smallCounts = 0;
        int intCounts = 0;

        ArrayList<String> strings = new ArrayList<>();

        String string;
        try {
            while ((string = br.readLine()) != null ) {
                for (int i = 0; i < string.length(); i++) {
                    int ascii = string.charAt(i);

                    if(ascii == SPACE) spaceCounts++;
                    else if (LARGE_A <= ascii && ascii <= LARGE_Z) largeCounts++;
                    else if (SMALL_A <= ascii && ascii <= SMALL_Z) smallCounts++;
                    else if (ZERO <= ascii && ascii <= NINE) intCounts++;
                }

                System.out.println(String.format("%d %d %d %d", smallCounts, largeCounts, intCounts, spaceCounts));
                smallCounts = 0;
                largeCounts = 0;
                intCounts = 0;
                spaceCounts = 0;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
