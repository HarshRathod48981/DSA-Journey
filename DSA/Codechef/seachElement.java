package Codechef;

import java.util.*;
import java.lang.*;

class searchElement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int elements = sc.nextInt();
            if ( elements == x){
                found = true;
            }
        }
        if (found){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
