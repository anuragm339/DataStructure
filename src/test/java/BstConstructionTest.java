import org.junit.Test;
import trees.BstConstruction;

import static org.junit.Assert.assertTrue;

public class BstConstructionTest {

    @Test
    public void TestCase1() {
        BstConstruction.BST root = new BstConstruction.BST(10);
        root.left = new BstConstruction.BST(5);
        root.left.left = new BstConstruction.BST(2);
        root.left.left.left = new BstConstruction.BST(1);
        root.left.right = new BstConstruction.BST(5);
        root.right = new BstConstruction.BST(15);
        root.right.left = new BstConstruction.BST(13);
        root.right.left.right = new BstConstruction.BST(14);
        root.right.right = new BstConstruction.BST(22);

        root.insert(12);
        assertTrue(root.right.left.left.value == 12);

        root.remove(10);
        assertTrue(root.contains(10) == false);
        assertTrue(root.value == 12);

        assertTrue(root.contains(15));
    }
}
