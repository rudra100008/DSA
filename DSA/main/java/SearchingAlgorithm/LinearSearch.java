package SearchingAlgorithm;
//In Linear Search, we iterate over all the elements of the array and check if it the current
// element is equal to the target element. If we find any element to be equal to the target element,
// then return the index of the current element. Otherwise, if no element is equal to the target element,
// return -1 as the element is not found. Linear search is also known as sequential search.
public class LinearSearch {

    public  int search(int[] arr, int N,int x){
        for (int i = 0; i<N; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 5;
        int index = linearSearch.search(arr,arr.length,x);
        if(index != -1){
            System.out.println("Index of " + x + ": " +  index);
        }else{
            System.out.println(x + " element doesn't exit in array.");
        }
    }
}
