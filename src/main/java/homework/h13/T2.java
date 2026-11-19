package homework.h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {
  public int maximumCount(int[] nums) {
    int neg = lowerBound(nums, 0);
    int pos = nums.length - lowerBound(nums, 1);
    return Math.max(neg, pos);
  }

  private int lowerBound(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
