package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void equalPositivesAndNegatives() {
    int[] input = new int[] {-2, -1, -1, 1, 2, 3};
    assertThat(task2.maximumCount(input)).isEqualTo(3);
  }

  @Test
  void withZerosInMiddle() {
    int[] input = new int[] {-3, -2, -1, 0, 0, 1, 2};
    assertThat(task2.maximumCount(input)).isEqualTo(3);
  }

  @Test
  void allPositives() {
    int[] input = new int[] {5, 20, 66, 1314};
    assertThat(task2.maximumCount(input)).isEqualTo(4);
  }

  @Test
  void allNegatives() {
    int[] input = new int[] {-10, -5, -1};
    assertThat(task2.maximumCount(input)).isEqualTo(3);
  }

  @Test
  void onlyZerosGivesZero() {
    int[] input = new int[] {0, 0, 0, 0};
    assertThat(task2.maximumCount(input)).isZero();
  }

  @Test
  void singleZeroGivesZero() {
    int[] input = new int[] {0};
    assertThat(task2.maximumCount(input)).isZero();
  }
}
