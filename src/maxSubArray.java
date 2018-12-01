package leetcode.src;

import java.util.*;


public class maxSubArray {
    /** 主方法 **/
    public static void main(String[] srgs){
        int[] A = new int[]{1,2,-3,4,5};
        System.out.println(maxSubArray(A));
    }

    public static int maxSubArray(int[] A){
        if (A.length == 0)
            return 0;

        int maxsum = A[0];
        int cursum = A[0];
        for(int i=1;i<A.length;++i){
            cursum = Math.max(A[i], cursum + A[i]);
            maxsum = Math.max(cursum, maxsum);
        }
        return maxsum;
    }

}
