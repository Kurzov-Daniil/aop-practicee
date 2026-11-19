package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void oddLengthWord() {
    char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
    task2.reverseString(input);

    assertThat(input).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void evenLengthWord() {
    char[] input = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};
    task2.reverseString(input);

    assertThat(input).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void singleCharacter() {
    char[] input = new char[] {'z'};
    task2.reverseString(input);

    assertThat(input).containsExactly('z');
  }

  @Test
  void twoCharacters() {
    char[] input = new char[] {'a', 'b'};
    task2.reverseString(input);

    assertThat(input).containsExactly('b', 'a');
  }

  @Test
  void palindromeRemainsUnchanged() {
    char[] input = new char[] {'r', 'a', 'd', 'a', 'r'};
    task2.reverseString(input);

    assertThat(input).containsExactly('r', 'a', 'd', 'a', 'r');
  }
}
