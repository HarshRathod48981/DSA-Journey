package DSA_kunal_kushwaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5};

        //Q1 - swap elements in array
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

        //Q2 - max in array
        max(arr);

        //Q3 reverse an array
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void max(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
