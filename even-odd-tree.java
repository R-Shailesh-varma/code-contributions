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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int lev = 0;
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }if(lev%2 == 0){
                if(!isEven(level)) return false;
            }else{
                if(!isOdd(level)) return false;
            }
            lev++;
        }return true;
    }public boolean isEven(List<Integer> level){
        for(int i = 0; i < level.size()-1; i++){
            if(level.get(i) >= level.get(i+1) || level.get(i)%2 != 1) return false;
        }
        if(level.get(level.size()-1) %2 != 1) return false;
        return true;
    }public boolean isOdd(List<Integer> level){
        for(int i = 0; i < level.size()-1; i++){
            if(level.get(i) <= level.get(i+1) || level.get(i)%2 == 1) return false;
        }
        if(level.get(level.size()-1) %2 == 1) return false;
        return true;
    }
}