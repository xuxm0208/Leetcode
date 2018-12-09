package leetcode.src;

import java.util.*;


public class maxArea {
    /** 主方法 **/
    public static void main(String[] args){
        int[] A = new int[]{8, 3, 5, 3, 9};
        System.out.println(maxArea(A));
    }

    public static int maxArea(int[] height){
        int i = 0;
        int j = height.length - 1;
        int water = 0;
        while(i<j){
            water = Math.max(water, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water;
    }
}