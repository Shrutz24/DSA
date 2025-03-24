package questions.random;

import java.util.HashMap;
import java.util.Map;

public class L217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                return true;
            }
        }
        return false;
    }
}
