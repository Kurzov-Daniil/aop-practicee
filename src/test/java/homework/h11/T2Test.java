package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    private final T2 task2 = new T2();

    @Test
    void standardThreeElements() {
        int[] input = new int[] {3, 2, 3};
        assertThat(task2.majorityElement(input)).isEqualTo(3);
    }

    @Test
    void sevenElementsWithAlternatingValues() {
        int[] input = new int[] {2, 2, 1, 1, 1, 2, 2};
        assertThat(task2.majorityElement(input)).isEqualTo(2);
    }

    @Test
    void singleElement() {
        int[] input = new int[] {42};
        assertThat(task2.majorityElement(input)).isEqualTo(42);
    }

    @Test
    void allElementsIdentical() {
        int[] input = new int[] {7, 7, 7, 7, 7};
        assertThat(task2.majorityElement(input)).isEqualTo(7);
    }

    @Test
    void negativeNumbers() {
        int[] input = new int[] {-1, -1, 2, -1, 5};
        assertThat(task2.majorityElement(input)).isEqualTo(-1);
    }

    @Test
    void majorityAtTheEnd() {
        int[] input = new int[] {1, 2, 3, 4, 4, 4, 4};
        assertThat(task2.majorityElement(input)).isEqualTo(4);
    }
}