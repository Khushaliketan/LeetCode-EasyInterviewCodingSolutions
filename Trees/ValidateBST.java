/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ValidateBST {
    /*Flawed solution
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        if(root.left!=null){
            if(root.left.val>=root.val)
                return false;
        }
        if(root.right!=null){
            if(root.right.val<=root.val)
                return false;
        }
        isValidBST(root.left);
        isValidBST(root.right);
        return true;
    }
    */
    public boolean isValidBST(TreeNode root){
        return BSTUtil(root, null, null);
    }
    public boolean BSTUtil(TreeNode root, TreeNode l, TreeNode r){
        if(root==null)
            return true;
        if(l!=null && l.val>=root.val)
            return false;
        if(r!=null && r.val<=root.val)
            return false;
        return(BSTUtil(root.left, l, root) && BSTUtil(root.right, root, r));
    }
}
