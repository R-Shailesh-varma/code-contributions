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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, res, path);
        return res;
    }public void dfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> path){
        if(root == null){
            return;
        }path.add(root.val);
        if(root.left == null && root.right == null && sum(path) == targetSum){
            res.add(new ArrayList<>(path));
        }
        dfs(root.left, targetSum, res, path);
        dfs(root.right, targetSum, res, path);
        path.remove(path.size() - 1);
    }public static int sum(List<Integer> arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }return sum;
    }
}