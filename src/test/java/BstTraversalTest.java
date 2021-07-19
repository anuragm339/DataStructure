import bst.BstTraversal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BstTraversalTest {

    @Test
    public void TestCase1() {
        BstTraversal.BST root = new BstTraversal.BST(10);
        root.left = new BstTraversal.BST(5);
        root.left.left = new BstTraversal.BST(2);
        root.left.left.left = new BstTraversal.BST(1);
        root.left.right = new BstTraversal.BST(5);
        root.right = new BstTraversal.BST(15);
        root.right.right = new BstTraversal.BST(22);

        List<Integer> inOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 10, 15, 22});
        List<Integer> preOrder = Arrays.asList(new Integer[] {10, 5, 2, 1, 5, 15, 22});
        List<Integer> postOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 22, 15, 10});

        assertTrue(BstTraversal.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder));
        assertTrue(BstTraversal.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder));
        assertTrue(BstTraversal.postOrderTraverse(root, new ArrayList<Integer>()).equals(postOrder));
    }
}
