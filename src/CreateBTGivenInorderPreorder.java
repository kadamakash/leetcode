/**
 * Created by Akash on 1/17/2017.
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class CreateBTGivenInorderPreorder {

    public TreeNode buildTree(int[] in, int[] pre){
        return createTree(in, pre, 0, 0, in.length-1);
    }

    public TreeNode createTree(int[] a, int[] b, int preStart, int inStart, int inEnd){
        if(preStart > b.length-1 || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(b[preStart]);
        int rootIdxInorder = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == root.val){
                rootIdxInorder = i;
            }
        }

        root.left = createTree(a, b, preStart+1, inStart, rootIdxInorder-1);
        root.right = createTree(a, b, preStart+rootIdxInorder-inStart+1, rootIdxInorder+1, inEnd);

        return root;
    }

    public static void main(String args[]){
        CreateBTGivenInorderPreorder c = new CreateBTGivenInorderPreorder();
        int inOrder[] = {2,5,6,10,12,14,15};
        int preOrder[] = {10,5,2,6,14,12,15};
        c.buildTree(inOrder, preOrder);
    }
}
