class Solution {
    public List<String> validStrings(int n) {
        if(n == 1){
            return new ArrayList<>(List.of("0", "1"));
        }
        List<String> prev = validStrings(n-1);
        List<String> cur = new ArrayList<>();
        for(String s: prev){
            if(s.charAt(n-2) != '0'){
                cur.add(s+"0");
            }
            cur.add(s+"1");
        }

        return cur;
    }
}