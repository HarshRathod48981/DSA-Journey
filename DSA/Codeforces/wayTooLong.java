package Codeforces;

import java.util.*;

public class wayTooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < T ; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < T; i++) {
            if (list.get(i).length() > 10){
                System.out.println(list.get(i).charAt(0)+""+(list.get(i).length()-2)+""+list.get(i).charAt(list.get(i).length()-1));
            }else{
                System.out.println(list.get(i));
            }
        }
    }
}
