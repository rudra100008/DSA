package SearchingAlgorithm;

public class RecursiveBinarySearch {
    public int binarySearch(int[] arr , int left , int right , int key){
        while ( left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == key){
                return mid;
            }
            if( arr[mid] < key)
                 return binarySearch(arr,mid+1,right,key);
            else
                return binarySearch(arr,left,mid-1,key);
        }
        return  -1;
    }
    public static void main(String[] args) {
        RecursiveBinarySearch binarySearch = new RecursiveBinarySearch();
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 91;
        int output = binarySearch.binarySearch(arr,0, arr.length-1 , key);


        if( output == -1){
            System.out.println("Element is not in array.");
        }else
            System.out.println("Output: " + output);
    }
}
//Time Complexity:
//Best Case: O(1)
//Average Case: O(log N)
//Worst Case: O(log N)
//Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(log N).