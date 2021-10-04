package interview;

import java.util.ArrayList;

public class KdistanceFromRoot<T> {
    class Node
    {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> returnList= new ArrayList<>();
    ArrayList<Integer> Kdistance(Node root, int k) {
        if(root!=null){
            return null;
        } if(k==0){
            returnList.add(root.data);
        }
        else{
            Kdistance(root.left,k-1);
            Kdistance(root.right,k-1);
        }
        return returnList;
    }

}
