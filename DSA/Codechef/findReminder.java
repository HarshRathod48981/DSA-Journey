package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;


public class findReminder {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rem = a % b;
            System.out.println(rem);
        }

    }
}