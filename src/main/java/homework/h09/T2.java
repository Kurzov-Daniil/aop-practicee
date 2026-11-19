package homework.h09;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class T2 {
  public static void main(String[] args) {
    T2 solver = new T2();
    int[] candies = {2, 3, 5, 1, 3};
    System.out.println(solver.kidsWithCandies(candies, 3));
  }

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for (int candy : candies) {
      if (candy > max) {
        max = candy;
      }
    }

    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      result.add(candy + extraCandies >= max);
    }

    return result;
  }
}
