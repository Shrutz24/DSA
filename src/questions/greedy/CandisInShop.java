package questions.greedy;

import java.util.ArrayList;
import java.util.Arrays;

/*

In a candy store, there are n different types of candies available and the prices of all the N different types of candies are provided to you. You are now provided with an attractive offer.
For every candy you buy from the store and get K other candies ( all are different types ) for free. Now you have to answer two questions. Firstly, you have to find what is the minimum amount of money you have to spend to buy all the n different candies. Secondly, you have to find what is the maximum amount of money you have to spend to buy all the n different candies.
In both the cases you must utilize the offer i.e. you buy one candy and get k other candies for free.

*/
public class CandisInShop {
    public static void main(String[] args) {
        int[] candies = {5,3,2,1,4};
        int N = 5;
        int K = 2;
        System.out.println(candyStore(candies, N, K));
    }
    public static ArrayList<Integer> candyStore(int[] candies, int N, int K){
        Arrays.sort(candies);
        System.out.println(Arrays.toString(candies));
        int min_amount = 0, max_amount = 0, i=0;
        int j=N-1;
        while(i<=j){
            min_amount += candies[i];
            ++i;
            j -=K;
        }
        i = N-1;
        j = 0;
        while(j<=i){
            max_amount += candies[i];
            --i;
            j +=K;
        }
        return new ArrayList<>(Arrays.asList(min_amount, max_amount));

    }
}


