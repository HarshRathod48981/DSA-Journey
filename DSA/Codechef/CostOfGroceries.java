package Codechef;
import javax.xml.transform.Source;
import java.util.*;

public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){

            int NumberOfItem = sc.nextInt(); //number of items
            int MinimunFreshnessVal = sc.nextInt(); //minimum freshness value

            int FressnessVal[] = new int[NumberOfItem];
            int cost = 0;

            for (int i = 0; i < NumberOfItem; i++) {
                FressnessVal[i] = sc.nextInt();
            }

            int CostOfItem[] = new int[NumberOfItem];

            for (int i = 0; i < NumberOfItem; i++) {
                CostOfItem[i] = sc.nextInt();
            }

            for (int i = 0; i < NumberOfItem; i++) {
                if (FressnessVal[i] >= MinimunFreshnessVal){
                    cost += CostOfItem[i];
                }
            }
            System.out.println(cost);

        }
    }
}
