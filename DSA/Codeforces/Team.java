package Codeforces;
import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Sure = 0;
        while (N-->+0){

            int Arr[][] = new int[N][3];

            for (int i = 0; i < N; i++) {
                int NumberOf1 = 0;
                for (int j = 0; j < 3; j++) {
                    Arr[i][j] = sc.nextInt();
                    if (Arr[i][j] == 1){
                        NumberOf1 += 1;
                    }
                }
                if (NumberOf1 >= 2){
                    Sure += 1;
                }
            }
        }
        System.out.println(Sure);
    }
}
