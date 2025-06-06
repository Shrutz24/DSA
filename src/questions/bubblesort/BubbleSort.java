package questions.bubblesort;

//Time complexity -> Best case = O(n), Worst case (sorted in opposite order) = O(n2)

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        boolean swapped ;
        //running the steps n-1 times.
        for(int i=0; i<arr.length; ++i){
            //for each step or pass, the max item will be at the left most side in the sorted order
            swapped = false;
            for(int j=1; j< arr.length; ++j){
                //swap if the next element is smaller than the previous element
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //If did not swap even a single time, this means that the array is sorted.
            //Stop the program
            if(!swapped){
                break;
            }

        }
    }
}
