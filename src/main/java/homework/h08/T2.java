package homework.h08;

import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class T2 {
    public static void main(String[] args) {
        T2 solver = new T2();
        System.out.println(solver.countPairs(List.of(-1, 1, 2, 3, 1), 2));
    }

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}