
/**
 * Created by Akash on 2/18/2017.
 */
public class BTLongestConsecutiveSequence {

    private int longestSequence(TreeNode root){
        return (root == null) ? 0 : Math.max(dfs(root.left, 1, root.val), dfs(root.right, 1, root.val));

    }

    private int dfs(TreeNode current, int count, int rootVal){
        if(current==null) return count;
        count = (current.val-1 == rootVal) ? count+1 : 1;
        int left = dfs(current.left, count, current.val);
        int right = dfs(current.right, count, current.val);

        return Math.max(count, Math.max(left, right));
    }
}
