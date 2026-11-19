package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Tests {
  private final T1 task1 = new T1();

  @Test
  void standardExampleAbbaca() {
    assertThat(task1.removeDuplicates("abbaca")).isEqualTo("ca");
  }

  @Test
  void cascadingDuplicatesAzxxzy() {
    assertThat(task1.removeDuplicates("azxxzy")).isEqualTo("ay");
  }

  @Test
  void allCharactersCancelOut() {
    assertThat(task1.removeDuplicates("abba")).isEmpty();
  }

  @Test
  void noAdjacentDuplicates() {
    assertThat(task1.removeDuplicates("abcdef")).isEqualTo("abcdef");
  }

  @Test
  void singleCharacter() {
    assertThat(task1.removeDuplicates("z")).isEqualTo("z");
  }

  @Test
  void oddNumberOfIdenticalCharactersLeavesOne() {
    assertThat(task1.removeDuplicates("aaaaa")).isEqualTo("a");
  }
}
