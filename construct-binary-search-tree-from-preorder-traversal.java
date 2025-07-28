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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            addTreeNode(root, preorder[i]);
        }
        return root;
    }public TreeNode addTreeNode(TreeNode root, int target){
        if(root == null){
            return new TreeNode(target);
        }if(target < root.val){
            root.left = addTreeNode(root.left, target);
        }else{
            root.right = addTreeNode(root.right, target);
        }
        return root;
    }
}