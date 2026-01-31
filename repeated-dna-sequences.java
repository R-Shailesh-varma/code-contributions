class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if(s.length() <= 10) return ans;
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 9; i++) sb.append(s.charAt(i));

        for(int i = 9; i < s.length(); i++){
            sb.append(s.charAt(i));
            
            String cur = sb.toString();
            if(map.keySet().contains(cur) && map.get(cur) == 1){
                ans.add(cur);
            }
            
            map.put(cur, map.getOrDefault(cur, 0)+1);

            sb.deleteCharAt(0);
        }
        return ans;
    }
}