class Solution {
    class TrieNode{
        TrieNode[] nodes;
        boolean isEnd;
        TrieNode(){
            nodes = new TrieNode[26];
            isEnd = false;
        }
    }

    private void insert(String s, TrieNode root){
        TrieNode temp = root;
        for(char c: s.toCharArray()){
            int idx = c - 'a';
            if(temp.nodes[idx] == null){
                temp.nodes[idx] = new TrieNode();
            }temp = temp.nodes[idx];
        }temp.isEnd = true;
    }

    private List<String> topThree(TrieNode root, String s){
        TrieNode nHead = root;
        List<String> three = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        for(char c: s.toCharArray()){
            int idx = c - 'a';
            if(nHead.nodes[idx] == null) return three;
            nHead = nHead.nodes[idx];
        }
        helper(sb, nHead, three);
        return three;
    }

    private void helper(StringBuilder sb, TrieNode root, List<String> topThree){
        if(topThree.size() == 3) return;
        if(root.isEnd == true){
            topThree.add(sb.toString());
        }
        for(int i = 0; i < 26; i++){
            if(root.nodes[i] != null){
                char c = (char) (i + 'a');
                sb.append(c);
                helper(sb, root.nodes[i], topThree);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = new TrieNode();
        for(String s: products){
            insert(s, root);
        }
        List<List<String>> ret = new ArrayList<>();
        for(int i = 1; i <= searchWord.length(); i++){
            ret.add(topThree(root, searchWord.substring(0, i)));
        }
        return ret;
    }
}