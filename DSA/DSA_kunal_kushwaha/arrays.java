package DSA_kunal_kushwaha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        //Q1 - swap elements in array
        //swap(arr,0,4);
        //System.out.println(Arrays.toString(arr));


        //Q2 - max in array
        int resultMax = max(arr);
        System.out.println(resultMax);

        //Q3 - min in array
        int resultMin = min(arr);
        System.out.println(resultMin);

        //Q4 reverse an array
        //reverse(arr);
        //System.out.println(Arrays.toString(arr));


    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int max(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        //System.out.println(max);
        return max;
    }

    static int min(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;

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
