package Codechef;

import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] a = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
            }
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                if (a[i] > largest) {
                    secondLargest = largest;
                    largest = a[i];
                } else if (a[i] > secondLargest && a[i] != largest) {
                    secondLargest = a[i];
                }
            }

            System.out.println(largest+secondLargest);



        }
    }
}


