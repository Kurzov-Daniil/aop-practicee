package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import homework.h15.T1.TreeNode;
import org.junit.jupiter.api.Test;

public class T1Tests {
    private final T1 task1 = new T1();

    @Test
    void invertsStandardTree() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        TreeNode inverted = task1.invertTree(root);

        assertThat(inverted.val).isEqualTo(4);
        assertThat(inverted.left.val).isEqualTo(7);
        assertThat(inverted.right.val).isEqualTo(2);
        assertThat(inverted.left.left.val).isEqualTo(9);
        assertThat(inverted.right.right.val).isEqualTo(1);
    }

    @Test
    void emptyTreeReturnsNull() {
        assertThat(task1.invertTree(null)).isNull();
    }
}