package concepts;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        System.out.println("Search in 2D Array");
        int[][] array = {
                {23,4,1},
                {18,2,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target= 34;
        System.out.println(Arrays.toString(search(array, target)));
        System.out.println(max(array));
        System.out.println(min(array));
    }
    public static int[] search(int[][]array, int target){
        for(int row=0; row<array.length; ++row){
            for(int col=0; col<array[row].length; ++col){
                if(array[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int max(int[][] array){
        int max = Integer.MIN_VALUE;
        for(int row=0; row< array.length; ++row){
            for(int col=0; col<array[row].length; ++col){
                if(array[row][col]>max) max = array[row][col];
            }
        }
        return max;
    }
    public static int min(int[][] array){
        int min = Integer.MAX_VALUE;
        for(int row=0; row<array.length; ++row){
            for(int col=0; col<array[row].length; ++col){
                if(array[row][col]<min) min = array[row][col];
            }
        }
        return min;
    }
}
