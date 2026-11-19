package homework.h11;

// https://leetcode.com/problems/missing-number/
public class T1 {
    public static void main(String[] args) {
        T1 solver = new T1();
        int[] nums = {3, 0, 1};
        System.out.println(solver.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}