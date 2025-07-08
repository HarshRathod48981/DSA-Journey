package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,4};
        int n = 4;
        Solution9 sol = new Solution9();
        int[] ans = sol.shuffle(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution9 {
    public int[] shuffle(int[] nums, int n) {
        int NewArray[] = new int[nums.length];
        int firstElement = 0;
        int secondElement = n;
        for (int i = 0; i < nums.length; i++) {

            NewArray[i] = nums[firstElement];
            NewArray[i+1] = nums[secondElement];
            firstElement++;
            secondElement++;
            i++;


        }
        return NewArray;

    }
}
