package Codechef;
import java.util.*;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
            }
            int beforeCoupon = sum;
            int afterCoupon = X;
            for (int i = 0; i < N; i++) {
                if(A[i]<=Y){
                    A[i]=0;
                }else{
                    A[i] -= Y;
                }
                afterCoupon += A[i];
            }
            //System.out.println(beforeCoupon+" "+afterCoupon);
            if (beforeCoupon>afterCoupon){
                System.out.println("COUPON");
            }else{
                System.out.println("NO COUPON");
            }
        }
    }
}
