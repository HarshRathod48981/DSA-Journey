package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;

            while (n > 0) {
                sum += n % 10;  // Add the last digit
                n /= 10;        // Remove the last digit
            }
            System.out.println(sum);


        }
    }
}
