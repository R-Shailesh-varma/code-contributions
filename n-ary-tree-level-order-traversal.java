/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levOrd = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> cur = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node n = q.poll();
                if(n == null) continue;
                cur.add(n.val);
                for(Node c: n.children){
                    q.offer(c);
                }
            }if(cur.size() > 0) levOrd.add(cur);
        }
        return levOrd;
    }
}