package Codechef;

import java.util.Scanner;

public class RunningComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        while (T-->0){
            int N = sc.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];

            for (int i = 0; i < N; i++) {
               a[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (a[i] > b[i]*2 || b[i] > a[i]*2) {
                    count += 1;
                }
            }
            int bothHappy = N - count;
            System.out.println(bothHappy);
            //System.out.println(count);

        }

    }
}
