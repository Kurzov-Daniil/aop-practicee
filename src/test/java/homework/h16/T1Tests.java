package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Tests {
    private final T1 task = new T1();

    @Test
    void test1() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        assertThat(task.floodFill(image, 1, 1, 2)).isEqualTo(expected);
    }

    @Test
    void test2() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}};
        assertThat(task.floodFill(image, 0, 0, 0)).isEqualTo(expected);
    }
}