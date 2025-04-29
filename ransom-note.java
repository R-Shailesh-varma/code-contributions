class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char i: magazine.toCharArray()){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(char i: ransomNote.toCharArray()){
            map2.put( i, map2.getOrDefault(i,0)+1);
        }for(char i: ransomNote.toCharArray()){
            if(!map1.containsKey(i) || map1.get(i) < map2.get(i)){
                return false;
            }
        }return true;
    }
}