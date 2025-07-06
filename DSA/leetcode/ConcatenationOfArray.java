package leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        Solution7 sol = new Solution7();
        int[] ans = sol.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution7{
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[(nums.length)*2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }

        return arr;
    }
}

