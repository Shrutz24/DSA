package questions.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, 2);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return -1;
    }
}
