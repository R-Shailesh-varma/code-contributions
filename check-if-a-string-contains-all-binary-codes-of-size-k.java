class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> sett = new HashSet<>();
        for(int i = 0; i <= s.length()-k; i++){
            sett.add(s.substring(i, i+k));
        }return sett.size() == (1 << k);
    }
}