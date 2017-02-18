import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Akash on 2/17/2017.
 */
public class BTLeftMostNode {
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int result  = 0;

        while(!q.isEmpty()){
            TreeNode current  = q.poll();
            if(current.right != null) q.add(current.right);
            if(current.left != null) q.add(current.left);
            result = current.val;
        }
        return result;

    }
}
