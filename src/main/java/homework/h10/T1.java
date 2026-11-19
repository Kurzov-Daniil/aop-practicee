package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
    public static void main(String[] args) {
        T1 solver = new T1();
        System.out.println(solver.kthCharacter(5));
    }

    public char kthCharacter(int k) {
        String word = "a";

        while (word.length() < k) {
            String next = "";
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == 'z') {
                    next += 'a';
                } else {
                    next += (char) (c + 1);
                }
            }
            word += next;
        }

        return word.charAt(k - 1);
    }
}