package DSA_kunal_kushwaha;

public class BinarySearch {
    public static void main(String[] args){

        int arr[] = {20,18,16,15,14,12,10,8,6,4,2};
        int result = binarySearchAccending(arr,12);
        System.out.println(result);

    }


    static int binarySearchAccending(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAccending = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return 1;
            }
            if (isAccending){
                if (target > arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
