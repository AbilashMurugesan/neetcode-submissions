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

class Solution {
    public boolean isValidBST(TreeNode root) {
        return help(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean help(TreeNode root, int lval,int rval){
        if(root==null){
            return true;
        }else if(root.val<=lval || root.val>=rval){
            return false;
        }else{
            return help(root.left,lval,root.val)&&
            help(root.right,root.val,rval);
        }
    }
}
