package questions.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(sortedMergeArray(nums1,nums2));

    }

    public static double sortedMergeArray(int[] nums1, int[] nums2){
        int i=0, j=0,k=0;
        int[] merge = new int[nums1.length + nums2.length];

        while(i< nums1.length && j< nums2.length){
            if(nums1[i]<=nums2[j]){
                merge[k++] = nums1[i++];
            }else{
                merge[k++] = nums2[j++];
            }
        }
        while(i< nums1.length){
            merge[k++] = nums1[i++];
        }
        while(j< nums2.length){
            merge[k++] = nums2[j++];
        }
        int mindex = merge.length/2;
        if(merge.length % 2 ==0){
            double temp = merge[mindex] + merge[mindex-1];
            return temp / 2;
        }else{
            return merge[mindex];
        }

    }
}
