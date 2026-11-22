package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import homework.h15.T2.TreeNode;
import org.junit.jupiter.api.Test;

public class T2Tests {
    private final T2 task2 = new T2();

    @Test
    void calculatesRangeSumCorrectly() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        assertThat(task2.rangeSumBST(root, 7, 15)).isEqualTo(32);
    }

    @Test
    void emptyTreeReturnsZero() {
        assertThat(task2.rangeSumBST(null, 1, 10)).isEqualTo(0);
    }
}