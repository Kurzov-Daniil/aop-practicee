package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Tests {
    private final T2 task = new T2();

    @Test
    void test1() {
        assertThat(task.findJudge(2, new int[][]{{1, 2}})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(task.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}})).isEqualTo(-1);
    }
}