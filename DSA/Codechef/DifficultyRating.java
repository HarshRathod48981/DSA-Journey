package Codechef;

import java.util.Scanner;

public class DifficultyRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] d = new int[N];

            for (int i = 0; i < N; i++) {
                d[i] = scanner.nextInt();
            }

            int yes = 0;
            for (int i = 1; i < N; i++) {
                if (d[i] >= d[0] ){
                    yes = 1;
                }else {
                    yes = 0;
                    break;
                }
            }
            if(yes == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
