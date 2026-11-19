package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    private final T1 task1 = new T1();

    @Test
    void missingInMiddle() {
        int[] input = new int[] {3, 0, 1};
        assertThat(task1.missingNumber(input)).isEqualTo(2);
    }

    @Test
    void missingIsN() {
        int[] input = new int[] {0, 1};
        assertThat(task1.missingNumber(input)).isEqualTo(2);
    }

    @Test
    void missingIsZero() {
        int[] input = new int[] {1, 2, 3};
        assertThat(task1.missingNumber(input)).isZero();
    }

    @Test
    void singleElementZeroMissingOne() {
        int[] input = new int[] {0};
        assertThat(task1.missingNumber(input)).isEqualTo(1);
    }

    @Test
    void singleElementOneMissingZero() {
        int[] input = new int[] {1};
        assertThat(task1.missingNumber(input)).isZero();
    }

    @Test
    void largerUnorderedArray() {
        int[] input = new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertThat(task1.missingNumber(input)).isEqualTo(8);
    }
}