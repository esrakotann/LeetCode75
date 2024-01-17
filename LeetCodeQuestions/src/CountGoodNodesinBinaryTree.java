public class CountGoodNodesinBinaryTree {
    public int goodNodes(TreeNode root) {
        return findGoodNodes(root.val,root);
    }

    public int findGoodNodes(int rootValue,TreeNode rootNode){
        if(rootNode==null) return 0;
        int result=0;
        if(rootNode.val>=rootValue){
            result++;
            rootValue = rootNode.val;
        }
        result +=findGoodNodes(rootValue,rootNode.left);
        result +=findGoodNodes(rootValue,rootNode.right);
        return result;
    }
}