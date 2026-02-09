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
    
    public TreeNode balanceBST(TreeNode root) {
        
        List<TreeNode> nodes = new ArrayList<>();
        int height = heightFill(nodes, root);
        if(height != -1)return root;

        for(TreeNode node: nodes){
            node.left = null;
            node.right = null;
        }

        int n = nodes.size()-1;
        return buildBalance(nodes, 0, n);

    }

    private TreeNode buildBalance(List<TreeNode> nodes, int left, int right){
        if(left > right) return null;
        if(left == right) return nodes.get(left);
        int mid = left + (right-left)/2;
        TreeNode root = nodes.get(mid);
        root.left = buildBalance(nodes, left, mid-1);
        root.right = buildBalance(nodes, mid+1, right);
        return root;

    }

    private int heightFill(List<TreeNode> lis, TreeNode root){
        if(root == null) return 0;
        int left = heightFill(lis, root.left);
        lis.add(root);
        int right = heightFill(lis, root.right);
        if(left == -1 || right == -1 || Math.abs(left-right) > 1) return -1;
        return Math.max(left, right)+1;
    }

}