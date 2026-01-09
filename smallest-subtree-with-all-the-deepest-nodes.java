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
    private int dep = Integer.MIN_VALUE; 
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dep = depth(root);
        return dfs(root, 0);
    }private int depth(TreeNode root){
        if(root == null) return -1;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.max(left, right) + 1;
    }private TreeNode dfs(TreeNode root, int depth){
        if(root == null) return null;
        if(depth == dep) return root;
        TreeNode left = dfs(root.left, depth+1);
        TreeNode right = dfs(root.right, depth+1);
        if(left != null && right != null) return root;
        return left != null ? left: right;
    }
}