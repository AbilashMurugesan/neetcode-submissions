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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        // int left=help(root.left);
        // int right=help(root.right);
        return help(root)==-1?false:true;
    }
    int help(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=help(root.left);
        int right=help(root.right);
        if(right==-1 || left==-1){
            return -1;
        }
        int res=Math.abs(left-right);
        if(res>1){
            return -1;
        }
        return 1+Math.max(left,right);
    }

}
