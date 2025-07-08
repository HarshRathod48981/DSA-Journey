package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int arr[] = {4,2,1,1,2};
        int extraCandies = 1;
        Solution10 sol = new Solution10();
        List<Boolean> ans = sol.kidsWithCandies(arr, extraCandies);
        System.out.println(ans);

    }
}


class Solution10 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max){
                max = candies[i];
            }
        }
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }

        return list;
    }
}