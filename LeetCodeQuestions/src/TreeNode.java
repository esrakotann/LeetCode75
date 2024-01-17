import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> child1 = new ArrayList<>();
        List<Integer> child2 = new ArrayList<>();
        findLeaf(root1,child1);
        findLeaf(root2,child2);
        return child1.equals(child2);
    }
    public void findLeaf(TreeNode node,List<Integer> listLeaf){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            listLeaf.add(node.val);
        }
        else{
            findLeaf(node.left,listLeaf);
            findLeaf(node.right,listLeaf);
        }
    }
}