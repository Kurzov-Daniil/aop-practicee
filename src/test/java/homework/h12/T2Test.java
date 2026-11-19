package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    private final T2 task2 = new T2();

    @Test
    void standardExampleWithExtraElements() {
        int[] arr1 = new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[] {2, 1, 4, 3, 9, 6};

        assertThat(task2.relativeSortArray(arr1, arr2))
                .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
    }

    @Test
    void secondExample() {
        int[] arr1 = new int[] {28, 6, 22, 8, 44, 17};
        int[] arr2 = new int[] {22, 28, 8, 6};

        assertThat(task2.relativeSortArray(arr1, arr2))
                .containsExactly(22, 28, 8, 6, 17, 44);
    }

    @Test
    void allElementsPresentInArr2() {
        int[] arr1 = new int[] {5, 1, 5, 2, 1};
        int[] arr2 = new int[] {5, 2, 1};

        assertThat(task2.relativeSortArray(arr1, arr2))
                .containsExactly(5, 5, 2, 1, 1);
    }

    @Test
    void singleElementArrays() {
        int[] arr1 = new int[] {0};
        int[] arr2 = new int[] {0};

        assertThat(task2.relativeSortArray(arr1, arr2)).containsExactly(0);
    }

    @Test
    void boundaryValuesZeroAndThousand() {
        int[] arr1 = new int[] {1000, 0, 500, 0};
        int[] arr2 = new int[] {1000};

        assertThat(task2.relativeSortArray(arr1, arr2))
                .containsExactly(1000, 0, 0, 500);
    }
}