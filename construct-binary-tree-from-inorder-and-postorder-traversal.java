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
    private int p;
    private int i;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        p = inorder.length-1;
        i = inorder.length - 1;
        return buildBST(inorder, postorder, Integer.MIN_VALUE);
    }private TreeNode buildBST(int[] inorder, int[] postorder, int stop){
        if(p < 0){
            return null;
        }if(inorder[i] == stop){
            --i;
            return null;
        }TreeNode root = new TreeNode(postorder[p--]);
        root.right = buildBST(inorder, postorder, root.val);
        root.left = buildBST(inorder, postorder, stop);
        return root;
    }
}