package sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int []arr = {2,300,40,6,23,20};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i=0;i < arr.length; i++){
            int last = arr.length - i - 1  ;
            int max = maxIndex(arr, 0, last);
            swap(arr, max , last);
        }
    }

    static int maxIndex(int[] arr , int start , int end){
        int max = start;
        for (int i = 0;i <= end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
