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
            StringBuilder string = new Str