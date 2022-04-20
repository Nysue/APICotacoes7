package com.company.boostcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399_ATM {
    public void main(){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] withdraw = new int[N];
        for(int i=0; i<N; i++) withdraw[i] = scanner.nextInt();

        Arrays.sort(withdraw);

        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++) sum += withdraw[j];
        }

        System.out.println(sum);
    }
}
