package leetcode;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {12,345,2,6,7896};
        int result = sol.findNumbers(arr);
        System.out.println(result);
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int evenNums = 0;
        for (int i = 0; i < nums.length; i++) {
            int noOfDigits = 0;
            while (nums[i]>0){
                nums[i] /= 10;
                noOfDigits+=1;
            }
            if (noOfDigits % 2 == 0){
                evenNums += 1;
            }
            //System.out.println(noOfDigits);
        }
        return evenNums;
    }
}
