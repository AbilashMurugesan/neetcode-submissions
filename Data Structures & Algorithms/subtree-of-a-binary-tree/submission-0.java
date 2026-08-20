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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        sb1.append("#");
        sb2.append("#");

            help(root,sb1);
            help(subRoot,sb2);

            return sb1.toString().contains(sb2.toString());

    }
    private void help(TreeNode root,StringBuffer sb){
        if(root==null){
            sb.append("N#");
            return ;
        }
        sb.append(root.val+"#");
        help(root.left,sb);
        help(root.right,sb);
    }
}