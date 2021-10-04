package bst;

public class HeightOfBst {
    public static class BST{
        public BST left;
        public BST right;
        public Integer value;
        public BST(Integer value){
            this.value=value;
        }
        public BST insert(Integer value){
            if(value<this.value){
                if(left==null){
                    BST newBST= new BST(value);
                    left=newBST;
                }else{
                    left.insert(value);
                }
            }else{
                if(right==null){
                    BST newBST= new BST(value);
                    right=newBST;
                }else{
                    right.insert(value);
                }
            }
            return this;
        }
    }
    int leftHeight=0;
    int rightHeight=0;
    public int height(BST tree,int x){
        if(tree==null){
            return x;
        }
        if(tree.left!=null) {
            leftHeight = height(tree.left, x + 1);
        } if(tree.right!=null) {
            rightHeight  = height(tree.right, x + 1);
        }
        return Math.max(leftHeight,rightHeight);

    }
}
