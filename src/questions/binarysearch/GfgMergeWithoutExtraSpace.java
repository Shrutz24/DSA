package questions.binarysearch;

/*
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10

*/


import java.lang.reflect.Array;
import java.util.Arrays;

public class GfgMergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {2,4,7,10};
        int[] b = {2,3};

        int[] merge;

        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                ++j;
            }else{
                ++i;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
