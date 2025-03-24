package questions.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; ++i){
            if(map.containsKey(nums[i]) && (Math.abs(map.get(nums[i]) - i) <= k)){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
