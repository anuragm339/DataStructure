package interview;

public class HieghtOfTree {
    static class Node
    {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    public int findHiegtTree(Node root){
        return reccurssion(root);
    }
    public int reccurssion(Node node){
        if(node==null){
            return 0;
        }
        int lefHieght=reccurssion(node.left);
        int rightHieght=reccurssion(node.right);
        if(lefHieght<rightHieght){
            return lefHieght+1;
        }else{
            return lefHieght+1;
        }
    }
    public static void main(String[] args)
    {
        HieghtOfTree hieghtOfTree = new HieghtOfTree();

        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        System.out.println("Height of tree is : " + hieghtOfTree.findHiegtTree(tree));
    }
}
