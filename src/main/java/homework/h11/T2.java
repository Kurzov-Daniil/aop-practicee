package homework.h11;

// https://leetcode.com/problems/majority-element/
public class T2 {
    public static void main(String[] args) {
        T2 solver = new T2();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solver.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}