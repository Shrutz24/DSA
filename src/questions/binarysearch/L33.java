package questions.binarysearch;

import java.util.Arrays;

public class L33 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,8,8,60,61};
        int target = 1;
        L33 l33 = new L33();
        System.out.println(Arrays.toString(l33.searchRange(nums,target)));

    }
    public int[] searchRange(int[] nums, int target) {
        int firstOccurance = search(nums,target,true);
        int lastOccurance = search(nums, target, false);
        return new int[]{firstOccurance, lastOccurance};
    }
    //This returns the index value of target
    int search(int[] nums, int target, boolean findFirstOccurance){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                //return mid;
                ans = mid;
                if(findFirstOccurance){
                    end = mid-1;
                }else{
                  start = mid+1;
                }
            }
        }
        return ans;
    }
}
