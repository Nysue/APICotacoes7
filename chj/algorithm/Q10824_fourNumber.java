
package com.company.boostcamp;


import java.util.Scanner;

public class Q10824_fourNumber {
    public void main(){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        String d = scanner.next();

        String ab = String.format("%s%s",a,b);
        String cd = String.format("%s%s",c,d);

        // need to be long, not int
        long result = Long.parseLong(ab, 10) + Long.parseLong(cd, 10);
        System.out.println(result);
    }
}