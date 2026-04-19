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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean ans = false;
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t.val == subRoot.val) ans |= helper(t, subRoot);
            if(t.left != null) q.offer(t.left);
            if(t.right != null) q.offer(t.right);
        }
        return ans;
    }

    public boolean helper(TreeNode r, TreeNode sr){
        if(r == null || sr == null) return r == sr;
        return r.val == sr.val && helper(r.left, sr.left) && helper(r.right, sr.right);
    }

}