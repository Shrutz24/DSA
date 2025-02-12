package questions.linearsearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class L1672 {
    public static void main(String[] args) {
        int[][]accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] accountHolders : accounts){
            int compoundedWealth = 0;
            for(int wealth : accountHolders){
                compoundedWealth += wealth;
            }
            if(compoundedWealth > maxWealth){
                maxWealth = compoundedWealth;
            }
        }
        return maxWealth;

    }
}
