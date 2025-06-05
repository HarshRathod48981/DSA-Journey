package Codechef;

import java.util.Scanner;

public class scaleneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a != b){
                if (b != c){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}

