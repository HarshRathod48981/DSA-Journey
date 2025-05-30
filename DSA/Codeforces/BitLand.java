package Codeforces;
import java.util.*;

public class BitLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 0;
        while (N-->0){
            String operation = sc.next();
            if (operation.equalsIgnoreCase("++X") || operation.equalsIgnoreCase("X++")){
                start++;
            } else if (operation.equalsIgnoreCase("--X") || operation.equalsIgnoreCase("X--")) {
                start--;
            }
        }

        System.out.println(start);

    }
}
