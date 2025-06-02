package Codechef;

import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int Smax;
            if (a > b && a > c) {
                if (b > c) {
                    Smax = b;
                } else {
                    Smax = c;
                }
            } else if (b > c) {
                if (a > c) {
                    Smax = a;
                } else {
                    Smax = c;
                }
            } else {
                if (a > b) {
                    Smax = a;
                } else {
                    Smax = b;
                }
            }
            System.out.println(Smax);

        }
    }
}
