package DSA_kunal_kushwaha;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //search in array : return the index if item found. return -1 if not found.
        int target1 = 7;
        int result1 = SearchIndex(arr, target1);
        //System.out.println(result1);


        //search a letter in string: return index if item found. return -1 if not found.
        String str = "Dave The Magical Cheese Wizard";
        char target2 = 't';
        int result2 = SearchIndex2(str, target2);
        //System.out.println(result2);


        //search in range: search for element n in the range of index [start to end]
        int target3 = 10;
        int start = 4;
        int end = 9;
        int result3 = SearchInRange(arr, target3, start, end);
        //System.out.println(result3);


        //search in 2D array: search the target element in 2D array. return 1 if found. -1 if not found.
        int arr2D[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target4 = 9;
        int[] result4 = SearchIn2DArray(arr2D, target4);
        System.out.println(Arrays.toString(result4));




    }


    static int SearchIndex(int arr[], int n) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }


    static int SearchIndex2(String string, char n){
        if (string.isEmpty()){
            return -1;
        }
        n = Character.toLowerCase(n);
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) == n){
                return 1;
            }
        }
        return -1;
    }


    static int SearchInRange(int arr[], int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if (arr[i] == target){
                return 1;
            }
        }
        return -1;
    }


    static int[] SearchIn2DArray(int arr[][], int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}







