package Array.MultiDimensionalArrays;

public class Practice1 {
    public static void main(String[] args) {
        //declaring and initializing two dimensional array
        int[][] array = new int[10][20];
         int row = array.length;
         int column = array[0].length;
        System.out.println("Row: " + row +
                           "\nColumn: "+ column);
    }
}
