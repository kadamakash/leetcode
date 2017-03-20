import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akash on 2/18/2017.
 */
public class BTViewFromRightSide {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;

    }

    private void rightView(TreeNode root, List<Integer> result, int depth){
        if(root == null) return;

        if(result.size() == depth){
            result.add(root.val);
        }

        rightView(root.right, result, depth+1);
        rightView(root.left, result, depth+1);
    }
}

