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
    private int depth;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        depth = dep(root);
        return dfs(root, 0);
    }private int dep(TreeNode root){
        if(root == null) return -1;
        int left = dep(root.left);
        int right = dep(root.right);
        return Math.max(left, right) + 1;
    }private TreeNode dfs(TreeNode root, int d){
        if(root == null) return null;
        if(d == depth) return root;
        TreeNode left = dfs(root.left, d+1);
        TreeNode right = dfs(root.right, d+1);
        if(left != null && right != null) return root;
        return left != null ? left : right;
    }
}