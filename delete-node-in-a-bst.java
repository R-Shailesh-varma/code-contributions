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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        return helper(root, key);
    }

    public TreeNode helper(TreeNode root, int key){
        
        if(root == null) return root;
        if(root.val > key) root.left = helper(root.left, key);
        else if(root.val < key) root.right = helper(root.right, key);

        if(root.val == key){
            return deleteNode(root);            
        }

        return root;

    }

    private TreeNode deleteNode(TreeNode root){
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(right == null && left == null) return null;
        else if(right == null) return left;
        else if(left == null) return right;
        else{
            
            TreeNode temp = root.right;
            while(temp.left != null){
                temp = temp.left;
            }

            temp.left = left;
            root = null;

        }return right; 
    }

}