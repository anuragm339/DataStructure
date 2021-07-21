import bst.MinimumAndMaximumHeightBst;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinimumAndMaximumHeightBstTest {
    @Test
    public void TestCase1() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        MinimumAndMaximumHeightBst.BST tree = MinimumAndMaximumHeightBst.minHeightBst(array);

        assertTrue(validateBst(tree));
        assertEquals(4, getTreeHeight(tree));
        List<Integer> inOrder =  inOrderTraverse(tree, new ArrayList<Integer>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        assertTrue(expected.equals(inOrder));
    }

    static boolean validateBst(MinimumAndMaximumHeightBst.BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean validateBst(MinimumAndMaximumHeightBst.BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }
        if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
            return false;
        }
        if (tree.right != null && !validateBst(tree.right, tree.value, maxValue)) {
            return false;
        }
        return true;
    }

    static List<Integer> inOrderTraverse(MinimumAndMaximumHeightBst.BST tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    static int getTreeHeight(MinimumAndMaximumHeightBst.BST tree) {
        return getTreeHeight(tree, 0);
    }

    static int getTreeHeight(MinimumAndMaximumHeightBst.BST tree, int height) {
        if (tree == null) return height;
        int leftTreeHeight = getTreeHeight(tree.left, height + 1);
        int rightTreeHeight = getTreeHeight(tree.right, height + 1);
        return Math.max(leftTreeHeight, rightTreeHeight);
    }
}
