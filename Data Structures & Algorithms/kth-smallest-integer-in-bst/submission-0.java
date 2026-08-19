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
    public int kthSmallest(TreeNode root, int k) {
        int[] poi=new int[2];
        // poi[0]=1;
        inorder(root,k,poi);
        return poi[1];
    }

    private void inorder(TreeNode root, int k,int[] poi){
        if(root!=null){
            inorder(root.left,k,poi);
            poi[0]++;
            if(poi[0]==k){
                poi[1]=root.val;
            }
            inorder(root.right,k,poi);
        }
    }
}
