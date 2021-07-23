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
    public int height(BST tree){
        if(tree==null){
            return 0;
        }
        int leftHeight=height(tree.left);
        int rightHeight=height(tree.right);
        if(leftHeight>rightHeight){
            return leftHeight+1;
        }else{
            return rightHeight+1;
        }

    }
}
