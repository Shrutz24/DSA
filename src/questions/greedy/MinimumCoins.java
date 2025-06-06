package questions.greedy;

import java.util.ArrayList;
import java.util.List;

//Making change of 143 by using coins of denomination{2000,1000,500,200,100,50,20,10,5,2,1} such that minimum number of coins are used.
public class MinimumCoins {
    public static void main(String[] args) {
        int amount = 143;
        System.out.println(minimumCoins(amount));
    }
    public static int minimumCoins(int amount){
        int[] currency = {2000,1000,500,200,100,50,20,10,5,2,1};
        List<String> currencyAdded = new ArrayList<>();
        int ans = 0, notes=0, i=0;
        while(amount != 0){
            notes = amount / currency[i];
            currencyAdded.add(notes +"|"+ currency[i]);
            ans +=notes;
            amount %= currency[i];
            ++i;
        }
        System.out.println(currencyAdded);
        return ans;
    }
    
}

