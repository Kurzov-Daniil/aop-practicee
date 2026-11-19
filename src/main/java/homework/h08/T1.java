package homework.h08;

// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {
  public static void main(String[] args) {
    T1 solver = new T1();
    int[] nums = {1, 1, 0, 1, 1, 1};
    System.out.println(solver.findMaxConsecutiveOnes(nums));
  }

  public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int currentCount = 0;

    for (int num : nums) {
      if (num == 1) {
        currentCount++;
        if (currentCount > maxCount) {
          maxCount = currentCount;
        }
      } else {
        currentCount = 0;
      }
    }

    return maxCount;
  }
}
