package LogicBuildingProblemsGFG;

import java.util.SortedMap;

public class prime {
    public static void main(String[] args) {
        int n = 4;
        int c = 2;
        while(c<n){
            if (n%c==0){
                System.out.println("not prime");
            }else{
                c = c+1;
            }
        }
        System.out.println("prime");
    }
}
