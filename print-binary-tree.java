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
    public List<List<String>> printTree(TreeNode root) {
        int ht = height(root);
        int cols = ((int)Math.pow(2, ht+1))- 1;
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < ht+1; i++){
            List<String> row = new ArrayList<>();
            for(int j = 0; j < cols; j++){
                row.add("");
            }ans.add(new ArrayList<>(row));
        }
        fillTheList(root, 0, cols/2, ht, ans);
        return ans;
    }private void fillTheList(TreeNode root, int r, int c, int h, List<List<String>> ans){
        if (root == null) return;
        int next = (int)Math.pow(2, h-r-1);
        ans.get(r).set(c, String.valueOf(root.val));
        fillTheList(root.left, r+1, c-next, h, ans);
        fillTheList(root.right, r+1, c+next, h, ans);
    }
    
    private int height(TreeNode root){
        if(root == null) return -1;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }
}