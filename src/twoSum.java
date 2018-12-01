package leetcode.src;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    /** 主方法 */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int target = 3;
        int[] ans = twoSum(numbers, target);
        System.out.println(ans[0] + " and " + ans[1]);
    }

    /** 返回两个数的下标 **/
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}