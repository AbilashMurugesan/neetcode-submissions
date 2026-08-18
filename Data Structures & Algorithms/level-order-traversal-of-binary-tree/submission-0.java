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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                ans.add(node.val);
            }
            res.add(new ArrayList<>(ans));
        }
        return res;
    }
}
