package homework.h10;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-string/
public class T2 {
    public static void main(String[] args) {
        T2 solver = new T2();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}