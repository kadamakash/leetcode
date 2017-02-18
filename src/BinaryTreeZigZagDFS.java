import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Akash on 2/17/2017.
 */
public class BinaryTreeZigZagDFS {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            List<List<Integer>> result = new ArrayList<>();
            dfs(root, result, 0);
            return result;

        }

        public void dfs(TreeNode root, List<List<Integer>> result, int level){
            if(root == null) return;

            if(result.size() <= level){
                List<Integer> levelList = new LinkedList<>();
                result.add(levelList);
            }

            List<Integer> levelItems = result.get(level);
            if(level % 2  == 0) levelItems.add(root.val);
            else {
                levelItems.add(0, root.val);
            }

            dfs(root.left, result, level+1);
            dfs(root.right, result, level+1);
        }
    }
}
