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
    static int preIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        return divideAndConquer(preorder, inorder, 0, inorder.length-1);
    }public static int findIndex(int[] inorder, int num){
        int index = 0;
        while(inorder[index] != num){
            index++;
        }return index;
    }public static TreeNode divideAndConquer(int[] preorder, int[] inorder, int low, int high){
        if(low > high){
            return null;
        }int idx = findIndex(inorder, preorder[preIndex]);
        TreeNode root = new TreeNode(preorder[preIndex++]);
        root.left = divideAndConquer(preorder, inorder,  low, idx-1);
        root.right = divideAndConquer(preorder, inorder, idx+1, high);
        return root;
    }
}