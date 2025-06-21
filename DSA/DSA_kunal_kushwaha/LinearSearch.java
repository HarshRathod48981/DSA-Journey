package DSA_kunal_kushwaha;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //search in array : return the index if item found. return -1 if not found.
        int target1 = 7;
        int result1 = SearchIndex(arr, target1);
        //System.out.println(result1);


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

}







