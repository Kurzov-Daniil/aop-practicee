package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

    private T1 withFirstBad(int badVersion) {
        return new T1() {
            @Override
            protected boolean isBadVersion(int version) {
                return version >= badVersion;
            }
        };
    }

    @Test
    void standardCase() {
        assertThat(withFirstBad(4).firstBadVersion(5)).isEqualTo(4);
    }

    @Test
    void singleVersionIsBad() {
        assertThat(withFirstBad(1).firstBadVersion(1)).isEqualTo(1);
    }

    @Test
    void firstVersionIsBad() {
        assertThat(withFirstBad(1).firstBadVersion(10)).isEqualTo(1);
    }

    @Test
    void lastVersionIsBad() {
        assertThat(withFirstBad(10).firstBadVersion(10)).isEqualTo(10);
    }

    @Test
    void largeNNoIntegerOverflow() {
        int n = Integer.MAX_VALUE;
        int bad = Integer.MAX_VALUE - 1;
        assertThat(withFirstBad(bad).firstBadVersion(n)).isEqualTo(bad);
    }
}