package homework.h14;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class T1 {
  public String removeDuplicates(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int len = sb.length();
      if (len > 0 && sb.charAt(len - 1) == c) {
        sb.deleteCharAt(len - 1);
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
