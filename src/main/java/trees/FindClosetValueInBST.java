package trees;

public class FindClosetValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {

        return findClosestVal(tree,target,Integer.MAX_VALUE);
    }

    static int findClosestVal(BST tree, int target, int closest) {
        if (tree == null) {
            return closest;
        } else {
            if (Math.abs(tree.value - target) < Math.abs(closest - target)) {
                closest = tree.value;
            }
            if (target < tree.value) {
                return findClosestVal(tree.left, target, closest);
            } else {
                return findClosestVal(tree.right, target, closest);
            }
        }
    }
    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
