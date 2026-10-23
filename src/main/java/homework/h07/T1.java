package homework.h07;

// https://leetcode.com/problems/fizz-buzz/
public class T1 {
    public java.util.List<String> fizzBuzz(int n) {
        java.util.List<String> result = new java.util.ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}