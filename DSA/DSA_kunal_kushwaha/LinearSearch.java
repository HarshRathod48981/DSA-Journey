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

}







