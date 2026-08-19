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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer sb=new StringBuffer();
        inorder(root,sb);
        return sb.toString();
    }

    private void inorder(TreeNode root, StringBuffer sb){
        if(root!=null){
            sb.append(root.val+"#");
            inorder(root.left,sb);
            inorder(root.right,sb);
        }else{
            sb.append("N#");
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str=data.split("#");
        return help(str,new int[]{0});
    }
    private TreeNode help(String[] str,int[] i){
        if(str[i[0]].equals("N")){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(str[i[0]]));
        i[0]++;
        node.left=help(str,i);
        i[0]++;
        node.right=help(str,i);
        return node;
    }
}
