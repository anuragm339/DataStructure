import org.junit.Test;
import bst.ValidateBst;

import static org.junit.Assert.assertTrue;

public class ValidateBstTest {
    @Test
    public void TestCase1() {
        ValidateBst.BST root = new ValidateBst.BST(10);
        root.left = new ValidateBst.BST(5);
        root.left.left = new ValidateBst.BST(2);
        root.left.left.left = new ValidateBst.BST(1);
        root.left.right = new ValidateBst.BST(5);
        root.right = new ValidateBst.BST(15);
        root.right.left = new ValidateBst.BST(13);
        root.right.left.right = new ValidateBst.BST(14);
        root.right.right = new ValidateBst.BST(22);

        assertTrue(ValidateBst.validateBst(root));
    }
}
