package homework.h09;

// https://leetcode.com/problems/number-of-good-pairs/
public class T1 {
  public static void main(String[] args) {
    T1 solver = new T1();
    int[] nums = {1, 2, 3, 1, 1, 3};
    System.out.println(solver.numIdenticalPairs(nums));
  }

  public int numIdenticalPairs(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
    }

    return count;
  }
}
