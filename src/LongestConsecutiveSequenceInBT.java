/**
 * Created by Akash on 2/12/2017.
 */
public class LongestConsecutiveSequenceInBT {

    private static int findSequenceLength(TreeNode root){
        return (root == null) ? 0 : Math.max(dfs(root.left, 1, root.val), dfs(root.right, 1, root.val));
    }

    private static int dfs(TreeNode currNode, int count, int rootVal){
        if(currNode == null) return count;
        count = (currNode.val - rootVal == 1) ? count+1 : 1;
        int left = dfs(currNode.left, count, currNode.val);
        int right = dfs(currNode.right, count, currNode.val);

        return Math.max(count, Math.max(left,right));
    }
}
