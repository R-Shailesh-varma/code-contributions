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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null) return null;
        return divideAndConquer(nums, 0, nums.length-1);
    }private TreeNode divideAndConquer(int[] nums, int low, int high){
        if(low > high){
            return null;
        }int mid = maxInd(nums, low, high);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = divideAndConquer(nums, low, mid-1);
        node.right = divideAndConquer(nums, mid+1, high);
        return node;
    }private int maxInd(int[] nums, int low, int high){
        int maxI = low;
        int max = 0;
        for(int i = low; i <= high; i++){
            if(nums[i] > max){
                max = nums[i];
                maxI = i;
            }
        }return maxI;
    }
}