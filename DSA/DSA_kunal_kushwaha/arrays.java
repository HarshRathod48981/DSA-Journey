package DSA_kunal_kushwaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        //Q1 - swap elements in array
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
