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
    static class Pair{
        TreeNode node;
        int col;
        int row;
        Pair(TreeNode node, int col, int row){
            this.row = row;
            this.node = node;
            this.col = col;
        } 
    } 
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        if(root == null) return sol;
        Pair head = new Pair(root, 0, 0);
        Queue<Pair> q = new LinkedList<>();
        q.offer(head);
        List<Pair> nodes = new ArrayList<>();
        nodes.add(head);
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.node.left != null){
                Pair np = new Pair(p.node.left, p.col-1, p.row+1);
                nodes.add(np);
                q.offer(np);
            }if(p.node.right != null){
                Pair np = new Pair(p.node.right, p.col+1, p.row+1);
                nodes.add(np);
                q.offer(np);
            }
        }

        Collections.sort(nodes, (a, b)->{
            if(a.col == b.col){
                if(a.row == b.row){
                    return a.node.val - b.node.val;
                }return a.row - b.row;
            }return a.col - b.col;
        });

        int srt = -9999;
        int idx = -1;
        for(int i = 0; i < nodes.size(); i++){
            if(nodes.get(i).col != srt){
                srt = nodes.get(i).col;
                idx++;
                sol.add(new ArrayList<>());
            }sol.get(idx).add(nodes.get(i).node.val);
        }
        return sol;
    }
}