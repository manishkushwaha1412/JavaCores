package algorthms.graph;

import java.util.Arrays;

public class DynamicProgramming {

    public static void main(String[] args) {
        int n = 8;
        int[] array = {7, 5, 1};
        int[] memoize = new int[n+1];
        Arrays.fill(memoize, -1);
        memoize[0] = 0;
        System.out.println(minCoins(n, array, memoize));
        for(int a:memoize){
            System.out.print(a+" ");
        }

    }

    static int minCoins(int n, int[] inputsArray, int[] memoize) {
        if (n == 0) return 0;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < inputsArray.length; i++) {
            int subAns = 0;
            if (n - inputsArray[i] >= 0) {
                if(memoize[n-inputsArray[i]] != -1){
                    subAns = memoize[n-inputsArray[i]];
                }else {
                    subAns = minCoins(n - inputsArray[i], inputsArray, memoize);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return memoize[n] = ans;
    }
}
