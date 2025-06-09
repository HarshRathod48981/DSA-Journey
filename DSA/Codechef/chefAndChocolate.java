package Codechef;

import java.util.Scanner;

public class chefAndChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int total = x*5 + y*10;
            int num = total/z;

            System.out.println(num);
        }
    }
}


