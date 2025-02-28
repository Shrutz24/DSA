package questions.linearsearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class L1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int evens = 0;
        for(int num:nums){
            //this is a shortcut for finding number of digits
            if((int)(Math.log10(num) + 1)%2 == 0) ++evens;
        }
        return evens;
    }

}
