package Codechef;

import java.util.Scanner;

public class candyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int totalAmt = 0;
            int x = scanner.nextInt(); //daily goal
            int y = scanner.nextInt(); //chocolates sold
            if (x == y){
                totalAmt = y;
            } else if (x > y) {
                totalAmt = y;
            } else if (y > x) {
                totalAmt = x + ((y-x)*2);
            }
            System.out.println(totalAmt);

        }
    }
}


