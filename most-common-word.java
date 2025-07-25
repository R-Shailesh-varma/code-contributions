class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[!?'.,;]", " ");
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.split("\\s+");
        HashMap<String, Integer> freq = new HashMap<>();
        for(String word: words){
            if(!set.contains(word) && !word.isEmpty()){
                freq.put(word, freq.getOrDefault(word, 0)+1);
            }
        }
        int max = 0;
        String res = "";
        for(Map.Entry<String, Integer> entry: freq.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                res = entry.getKey();
            }
        }return res;
    }
}