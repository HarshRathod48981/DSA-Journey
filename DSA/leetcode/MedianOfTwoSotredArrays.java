package leetcode;

import java.util.Arrays;

public class MedianOfTwoSotredArrays {
    public static void main(String[] args) {

        Solution3 sol = new Solution3();

        int[] arr1 = {1, 2};
        int[] arr2 = {3,4};

        double result = sol.findMedianSortedArrays(arr1, arr2);
        System.out.println(result);
    }
}

class Solution3 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mediean = 0;

        int combined[] = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combined, 0, nums1.length);
        System.arraycopy(nums2, 0, combined,nums1.length, nums2.length);

        Arrays.sort(combined);
        //System.out.println(Arrays.toString(combined));
        int count = 0;
        for (int i = 0; i < combined.length; i++) {
            count++;
        }
        if (count % 2 == 0){
            mediean = (double) (combined[count / 2] + combined[(count / 2) - 1]) /2;
        }else{
            mediean = combined[count/2];
        }

        return mediean;
    }
}