package Arrays;
import java.util.*;

public class maximumArray {

    static void method1(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (sc.hasNext()){
            int N = sc.nextInt();
            int max = 0;
            for (int i = 0; i < N; i++) {
                int Arr = sc.nextInt();
                if (max < Arr) {
                    max = Arr;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }

    static void method2(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

        }{
            int N = sc.nextInt();
            int max = 0;
            for (int i = 0; i < N; i++) {
                int Arr = sc.nextInt();
                if (max < Arr) {
                    max = Arr;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }

    public static void main(String[] args) {

        method1();
        method2();
    }

}
