package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    private final T2 task2 = new T2();

    @Test
    void standardExample() {
        int[] candies = new int[] {2, 3, 5, 1, 3};
        assertThat(task2.kidsWithCandies(candies, 3))
                .containsExactly(true, true, true, false, true);
    }

    @Test
    void onlyOneKidCanReachMax() {
        int[] candies = new int[] {4, 2, 1, 1, 2};
        assertThat(task2.kidsWithCandies(candies, 1))
                .containsExactly(true, false, false, false, false);
    }

    @Test
    void tieWithCurrentMaxCountsAsGreatest() {
        int[] candies = new int[] {12, 1, 12};
        assertThat(task2.kidsWithCandies(candies, 10))
                .containsExactly(true, false, true);
    }

    @Test
    void allKidsHaveEqualCandies() {
        int[] candies = new int[] {5, 5, 5, 5};
        assertThat(task2.kidsWithCandies(candies, 1))
                .containsExactly(true, true, true, true);
    }

    @Test
    void exactEqualityWithMax() {
        int[] candies = new int[] {1, 4, 2};
        assertThat(task2.kidsWithCandies(candies, 3))
                .containsExactly(true, true, true);
    }

    @Test
    void minimumLengthTwoKids() {
        int[] candies = new int[] {1, 100};
        assertThat(task2.kidsWithCandies(candies, 50))
                .containsExactly(false, true);
    }
}