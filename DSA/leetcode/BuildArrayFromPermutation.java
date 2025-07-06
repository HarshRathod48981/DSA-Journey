package leetcode;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        Solution6 sol = new Solution6();
        int[] ans = sol.buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution6 {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}

