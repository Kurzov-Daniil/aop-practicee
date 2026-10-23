package homework.h05;

// advanced
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class T2 {
    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }
            java.util.Arrays.sort(result);
            return result;
        }
    }
}