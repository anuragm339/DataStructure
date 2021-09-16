package recurssion;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> intList= new ArrayList<>();
        while (root!=null) {
            intList.add(pathSumRecursion(root.left, targetSum, new ArrayList<>()));
        }
        return null;
    }

    public List<Integer> pathSumRecursion(TreeNode node, int targetSum, List<Integer> integerList){
        pathSumRecursion(node.left,targetSum,integerList);
        return null;
    }
}
