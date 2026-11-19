package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    private final T1 task1 = new T1();

    @Test
    void mixedHeights() {
        int[] input = new int[] {1, 1, 4, 2, 1, 3};
        assertThat(task1.heightChecker(input)).isEqualTo(3);
    }

    @Test
    void reverseSortedAllMismatch() {
        int[] input = new int[] {5, 1, 2, 3, 4};
        assertThat(task1.heightChecker(input)).isEqualTo(5);
    }

    @Test
    void alreadySortedGivesZero() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        assertThat(task1.heightChecker(input)).isZero();
    }

    @Test
    void singleElement() {
        int[] input = new int[] {42};
        assertThat(task1.heightChecker(input)).isZero();
    }

    @Test
    void allEqualElements() {
        int[] input = new int[] {3, 3, 3, 3};
        assertThat(task1.heightChecker(input)).isZero();
    }

    @Test
    void doesNotMutateInputArray() {
        int[] input = new int[] {4, 2, 1, 3};
        task1.heightChecker(input);
        assertThat(input).containsExactly(4, 2, 1, 3);
    }
}