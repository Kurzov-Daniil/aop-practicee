package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void firstCharacterIsA() {
    assertThat(task1.kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void fifthCharacterIsB() {
    assertThat(task1.kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void tenthCharacterIsC() {
    assertThat(task1.kthCharacter(10)).isEqualTo('c');
  }

  @Test
  void powerOfTwoPositions() {
    assertThat(task1.kthCharacter(2)).isEqualTo('b');
    assertThat(task1.kthCharacter(4)).isEqualTo('c');
    assertThat(task1.kthCharacter(8)).isEqualTo('d');
    assertThat(task1.kthCharacter(16)).isEqualTo('e');
  }

  @Test
  void maxConstraintK500() {
    assertThat(task1.kthCharacter(500)).isEqualTo('h');
  }
}
