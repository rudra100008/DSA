package Array.SingleArray;

public class CloneArray {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        int[] clone = array.clone();

        System.out.println(array == clone);

        for (int i=0; i<array.length;i++){
            System.out.println(array[i] == clone[i]);
        }
    }
}
