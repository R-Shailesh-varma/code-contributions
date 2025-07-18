/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        map.put(node, new Node(node.val));
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            Node n = q.poll();
            for(Node n1: n.neighbors){
                
                if(!map.containsKey(n1)){
                    map.put(n1, new Node(n1.val));
                    q.offer(n1);
                }
                map.get(n).neighbors.add(map.get(n1));
            }
        }return map.get(node);
    }
}