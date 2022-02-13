package com.practice.algo;

import sun.misc.LRUCache;

import java.util.Arrays;

public class DynamicPrograming {


    /* Dynamic programing is based on divide and conquer where major problem will be divided into small problem
    and while doing so we need to identify which steps are getting repeated. We need to work on repeated item only once
    and use them where ever its getting called. if we do so then complexity will be reduced
    */

    // Lets take example of taking some coins and making combination of it.

    public static void main(String[] args) {
        int[] coins = new int[]{1, 5, 7};
        int number = 18;
        int[] dp = new int[number+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int val = subCoins(coins, number, dp);
        for (int i = 0; i < dp.length ; i++) {
            System.out.print(dp[i]+" ");
        }
//        /System.out.println(val);
    }

    public static int subCoins(int[] coins, int number, int[] dp) {

        if (number == 0) return 0;
        int val = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {

            if (number - coins[i] >= 0) {
                int subCoins = 0;
                if(dp[number-coins[i]] != -1){
                    subCoins = dp[number-coins[i]];
                }else{
                    subCoins = subCoins(coins, number - coins[i], dp);
                }
                if (subCoins != Integer.MAX_VALUE && subCoins + 1 < val) {
                    val = subCoins + 1;
                }
            }
        }
        return dp[number] = val;
    }


}
