package leetcode;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};

        Solution4Optimised sol = new Solution4Optimised();
        int result = sol.maxArea(height);
        System.out.println(result);
    }
}

class Solution4Unoptimised {
    public int maxArea(int[] height) {
        int Maxarea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int w = j-1;
                int ht = min(height[i], height[j]);
                int vol = ht*w;
                Maxarea = max(Maxarea,vol);
            }
        }
        return Maxarea;
    }
}


class Solution4Optimised {
    public int maxArea(int[] height){
        int Maxarea = 0;
        int n = height.length;
        int lp =0;
        int rp = n-1;
        while (lp < rp){
            int w = rp-lp;
            int ht = Math.min(height[lp], height[rp]);
            Maxarea = Math.max(Maxarea,(w*ht));
            if (height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return Maxarea;
    }
}