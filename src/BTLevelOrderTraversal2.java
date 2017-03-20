import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Akash on 2/18/2017.
 */
public class BTLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> levelList = new LinkedList<Integer>();
            for(int i = 0; i < level; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                levelList.add(q.poll().val);
            }
            result.add(0, levelList);
        }
        return result;
    }
}
