package Codechef;
import  java.util.*;

public class minToMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //number of testcases

        while (T-->0){
            int N = sc.nextInt();
            if (N == 0) {
                System.out.println(0);
                continue;
            }

            int Arr[] = new int[N]; //array

            for (int i = 0; i < N; i++) {
                Arr[i] = sc.nextInt();
            }
            int minCount = 0;
            int min = Arr[0]; //smallest number in array // 2, 3, 4, 5, 1, 1 //min = 2
            for (int i = 0; i < N; i++) {
                if (min > Arr[i]){
                    min = Arr[i];
                    minCount = 1;
                }else if (min == Arr[i]){
                    minCount++;
                }
            }
            int M = Arr.length - minCount;
            System.out.println(M);

        }
    }
}
