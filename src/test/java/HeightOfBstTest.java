import bst.HeightOfBst;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeightOfBstTest {
    @Test
    public void testCase1(){
        HeightOfBst.BST root = new HeightOfBst.BST(10);
        root.left=new HeightOfBst.BST(8);
        root.right=new HeightOfBst.BST(9);
        root.left.left=new HeightOfBst.BST(5);
        root.left.right = new HeightOfBst.BST(7);
        HeightOfBst height= new HeightOfBst();
        int height1 = height.height(root);
        assertEquals(3,height1);
    }
}
