package com.algo.test.sort;

import java.util.Arrays;

public class DynamicProgramming {

    public static void main(String[] args) {
        int n = 18;
        int[] array = {7, 5, 1};
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = minCoins(array, n, dp);
        System.out.println(ans);
    }

    static int minCoins(int[] array, int n, int[] dp){
        if(n==0) return 0;
        int val = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(n-array[i] >= 0) {
                int subCoin = 0;
                if(dp[n-array[i]] != -1){
                    subCoin = dp[n-array[i]];
                }else {
                    subCoin = minCoins(array, n - array[i], dp);
                }
                if (subCoin != Integer.MAX_VALUE && subCoin + 1 < val) {
                    val = subCoin + 1;
                }
            }
        }
    return dp[n] = val;
    }


}
