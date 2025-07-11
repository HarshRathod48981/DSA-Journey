package leetcode;

import java.util.List;

public class NumberOfGoodPair {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};

        Solution11 sol = new Solution11();
        int ans = sol.numIdenticalPairs(arr);
        System.out.println(ans);
    }
}

class Solution11 {
    public int numIdenticalPairs(int[] nums) {
        int howMany = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] == nums[j]){
                    howMany++;
                }
            }
        }
        return howMany;
    }
}

