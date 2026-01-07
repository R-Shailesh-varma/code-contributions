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
    long ans = 0;
    static final int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        long tSum = totalSum(root);
        dfs(root, tSum);
        return (int)(ans % MOD);
    }
    private long totalSum(TreeNode root){
        if(root == null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);
    }
    private long dfs(TreeNode root, long tSum){
        if(root == null) return 0;
        long left = dfs(root.left, tSum);
        long right = dfs(root.right, tSum);
        long sbtSum = left + right + root.val;
        long curProd = sbtSum * (tSum-sbtSum);
        ans = Math.max(ans, curProd);
        return sbtSum;
    }
}