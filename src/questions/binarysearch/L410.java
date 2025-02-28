package questions.binarysearch;

public class L410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(nums,2));
    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length;++i){
            //In the end this will have the max number in array
            start = Math.max(start,nums[i]);
            end += nums[i];

        }
        // do binary search
        while(start < end) {
            //mid is the potential answer
            int mid = start + (end - start) / 2;
            //calculate pieces in which this array can be divided with max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //cannot add in sub array, make new one
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    ++pieces;
                }else {
                    sum += num;

                }
            }
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;


    }

    public static int maxSum(int[] nums){
        int max = 0;
        for(int num : nums){
            max += num;
        }
        return max;
    }

    public static int minSum(int[] nums){
        int min = nums[0];
        for(int num : nums){
            if(min < num){
                min = num;
            }
        }
        return min;
    }


}
