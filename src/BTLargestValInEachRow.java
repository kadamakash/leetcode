import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Akash on 2/17/2017.
 */
public class BTLargestValInEachRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            int max = Integer.MIN_VALUE;
            for(int i =0; i < size; i++){
                TreeNode current = q.poll();
                max = Math.max(max, current.val);
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }
            result.add(max);
        }

        return result;

    }
}
