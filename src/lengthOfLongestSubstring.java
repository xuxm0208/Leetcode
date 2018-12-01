package leetcode.src;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    /** 主方法 **/
    public static void main(String[] args){
        String s="hasjkhdkqdqhsksah";
        System.out.println(lengthOfLongestSubstring(s));
    }

    /** 最长子字符串 **/
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}


