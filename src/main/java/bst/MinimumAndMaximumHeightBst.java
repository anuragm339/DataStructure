package bst;

import java.util.Collections;
import java.util.List;

public class MinimumAndMaximumHeightBst {
    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
        public BST insert(Integer value){
            if(value<this.value){
                if(left==null){
                    BST newBst=new BST(value);
                    left=newBst;
                }else{
                    left.insert(value);
                }
            }
            if(value>this.value){
                if(right==null){
                    BST newBst=new BST(value);
                    right=newBst;
                }else{
                    right.insert(value);
                }
            }
            return this;
        }
    }
    public static BST constructMinHeightBst(List<Integer> array, BST bst, int startIdx, int endIdx) {
        if (endIdx < startIdx) return null;
        int midIdx = (startIdx + endIdx) / 2;
        int valueToAdd = array.get(midIdx);
        if (bst == null) {
            bst = new BST(valueToAdd);
        }else{
            bst.insert(valueToAdd);
        }
        constructMinHeightBst(array, bst, startIdx, midIdx - 1);
        constructMinHeightBst(array, bst, midIdx + 1, endIdx);
        return bst;
    }
    public static BST minHeightBst(List<Integer> array) {
        Collections.sort(array);
        return constructMinHeightBst(array, null, 0, array.size() - 1);
    }
}
