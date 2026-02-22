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
    int pathSum = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root, true, 0);
        return pathSum;
    }

    private void dfs(TreeNode root, boolean left, int steps){
        if(root == null) return;
        pathSum = Math.max(pathSum, steps);
        if(left){
            dfs(root.left, false, steps+1);
            dfs(root.right, true, 1);
        }else{
            dfs(root.left, false, 1);
            dfs(root.right, true, steps+1);
        }
    }

}