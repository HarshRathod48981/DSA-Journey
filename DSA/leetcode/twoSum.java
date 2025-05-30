package leetcode;
import java.util.*;

public class twoSum {
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0]+" "+res[1] );
    }
}
