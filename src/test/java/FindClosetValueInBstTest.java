import org.junit.Assert;
import org.junit.Test;
import bst.FindClosetValueInBST;

public class FindClosetValueInBstTest {
    @Test
    public void TestCase1() {
        FindClosetValueInBST.BST root = new FindClosetValueInBST.BST(10);
        root.left = new FindClosetValueInBST.BST(5);
        root.left.left = new FindClosetValueInBST.BST(2);
        root.left.left.left = new FindClosetValueInBST.BST(1);
        root.left.right = new FindClosetValueInBST.BST(5);
        root.right = new FindClosetValueInBST.BST(15);
        root.right.left = new FindClosetValueInBST.BST(13);
        root.right.left.right = new FindClosetValueInBST.BST(14);
        root.right.right = new FindClosetValueInBST.BST(22);

        int expected = 13;
        int actual = FindClosetValueInBST.findClosestValueInBst(root, 12);
        Assert.assertEquals(expected, actual);
    }
}
