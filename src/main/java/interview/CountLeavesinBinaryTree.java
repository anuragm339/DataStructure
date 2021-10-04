package interview;

public class CountLeavesinBinaryTree {
    class Node
    {
        int data;
        Node left, right;
    }
    int countLeaves(Node node)
    {
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        if(node.left!=null){
            countLeaves(node.left);
        }
        if(node.right!=null){
            countLeaves(node.right);
        }
        return 0;

    }

}
