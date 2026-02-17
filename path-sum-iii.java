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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        helper(root, targetSum, 0L);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    private void helper(TreeNode root, int targetSum, long curSum){
        if(root == null) return;
        long newSum = curSum + root.val;
        if(newSum == targetSum) count++;
        helper(root.left, targetSum, newSum);
        helper(root.right, targetSum, newSum);
    }

}