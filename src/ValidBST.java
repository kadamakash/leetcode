/**
 * Created by Akash on 2/1/2017.
 */
/*public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return checkIfValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkIfValid(TreeNode root, minV, maxV){
        if(root == null) return true;
        if(root.val >= maxV || root.val <= minV) return false;
        return checkIfValid(root.left, minV, root.val) && checkIfValid(root.right, root.val, maxV);

    }
}*/
