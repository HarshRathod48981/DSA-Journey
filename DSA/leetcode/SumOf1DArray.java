package leetcode;

import java.util.Arrays;

public class SumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution8 sol = new Solution8();
        int[] ans = sol.runningSumBack(nums);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution8 {
    public int[] runningSumBack(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            arr[i] = sum;
        }
        return arr;
    }

}
