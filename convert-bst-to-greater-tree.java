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
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }int dfs(TreeNode root, int sum){
        if(root == null) return sum;
        if(root.left == null && root.right == null){
            root.val += sum;
            return root.val;
        }
        int right = dfs(root.right, sum);
        root.val += right;
        return dfs(root.left, root.val);
    }
}