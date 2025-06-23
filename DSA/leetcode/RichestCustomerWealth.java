package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        Solution1 sol = new Solution1();
        int result = sol.maximumWealth(accounts);
        System.out.println(result);
    }
}

class Solution1 {
    public int maximumWealth(int[][] accounts) {
        int MaxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int MaxWealth1 = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                MaxWealth1 += accounts[i][j];
            }
            if (MaxWealth < MaxWealth1){
                MaxWealth = MaxWealth1;
            }
        }
        return MaxWealth;
    }
}

