package recurrence;

public class BinarySearchRec {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9};

        System.out.println(search(arr,9 ,0,6));
    }

    public static int search(int[] arr, int target , int start ,  int end){
         if(start > end){
             return -1;
         }

         int mid = start + (end-start)/2;

         if(arr[mid] == target){
             return mid;
         }

         if (arr[mid] < target){
             return search(arr,target,mid+1,end);
         }

         return search(arr,target,start,mid-1);
    }
}
