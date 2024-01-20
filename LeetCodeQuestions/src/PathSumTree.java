import java.util.ArrayList;
import java.util.List;

public class PathSumTree {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        sum(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return count;
    }

    public void sum(TreeNode root, int targetSum,long total){
        if(root==null) return;
        total += root.val;
        if(targetSum == total){
            count++;
        }

        sum(root.left,targetSum,total);
        sum(root.right, targetSum,total);
    }
}
