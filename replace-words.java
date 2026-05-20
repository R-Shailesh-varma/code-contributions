class Solution {
    class Trie{
        Trie[] nodes;
        boolean isEnd;
        Trie(){
            nodes = new Trie[26];
            isEnd = false;
        }
    }

    void insert(String word, Trie root){
        Trie temp = root;
        for(char c: word.toCharArray()){
            int i = c - 'a';
            if(temp.nodes[i] == null){
                temp.nodes[i] = new Trie();
            }
            temp = temp.nodes[i];
        }temp.isEnd = true;
    }

    String words(Trie root, String word){
        if(root.nodes[word.charAt(0)-'a'] == null) return word;
        Trie temp = root;
        int i = 0;
        for(i = 0; i < word.length(); i++){
            int c = word.charAt(i) - 'a';
            if(temp.isEnd) return word.substring(0, i);
            else if(temp.nodes[c] == null){
                return word;
            }temp = temp.nodes[c];
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie root = new Trie();
        for(String s: dictionary){
            insert(s, root);
        }
        List<String> lis = new ArrayList<>();
        for(String s: sentence.split(" ")){
            lis.add(words(root, s));
        }
        
        return String.join(" ", lis);
    }
}