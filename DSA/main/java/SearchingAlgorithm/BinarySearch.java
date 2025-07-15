package SearchingAlgorithm;
//Binary Search Algorithm
//Below is the step-by-step algorithm for Binary Search:
//
//Divide the search space into two halves by finding the middle index "mid".
//Compare the middle element of the search space with the key.
//If the key is found at middle element, the process is terminated.
//If the key is not found at middle element, choose which half will be used as the next search space.
//If the key is smaller than the middle element, then the left side is used for next search.
//If the key is larger than the middle element, then the right side is used for next search.
//This process is continued until the key is found or the total search space is exhausted.


public class BinarySearch {
    public int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid =  left + (right - left)/2;
            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 91;
        int output = binarySearch.binarySearch(arr,key);


        if( output == -1){
            System.out.println("Element is not in array.");
        }else
            System.out.println("Output: " + output);
    }
}
//Time Complexity: O(log N)
//Auxiliary Space: O(1)