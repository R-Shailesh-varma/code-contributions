class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        String sep = ""+separator;
        if(separator == '.' || separator == '|' || separator == '$'){
            sep = "\\"+separator;
        }
        List<String> ans = new ArrayList<>();
        for(String s: words){
            String[] cur = s.split(sep);
            for(String c: cur){
                if(c.length() != 0) ans.add(c);
            }
        }

        return ans;
    }
}