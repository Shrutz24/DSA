package rough.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Leetcode21 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,2,5,3,1);
        int target = 3;
        int count = 0;
        System.out.println(nums.size());
        int temp = 0;
        for(int i=1;i<=target; ++i){

            for(int j=nums.size()-1; j>-1; --j){
                ++temp;
                if(nums.get(j) == i){
                    if(temp > count){
                        count = temp;

                    }
                    temp = 0;
                    break;
                }
            }
        }
        System.out.println(count);


        for(int i=1;i<=target; ++i){
            int finalI = i;
            nums.stream()
                    .mapToInt(Integer::intValue)
                    .filter(x->x== finalI)
                    .map(x->nums.size() - nums.indexOf(x))
                    .findFirst()
                    .orElse(0);

            count = Math.max(count, temp );
        }
        System.out.println(count);


    }
}
