package bst;

public class ValidateBst {
    public static boolean validateBst(BST tree) {
        // Write your code here.

        return isBSTUtil(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


    static boolean isBSTUtil(BST tree, int min, int max)
    {
        if(tree.value<min || tree.value>=max){
            return false;
        }
        if(tree.left!=null && !isBSTUtil(tree.left,min,tree.value)){
            return false;
        }
        if(tree.right!=null && !isBSTUtil(tree.right,tree.value,max)){
            return false;
        }

        return true;
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
