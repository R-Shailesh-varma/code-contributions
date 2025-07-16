class Solution {
    public static Map<Integer, List<String>> map = new HashMap<>();

    static {
        map.put(2, Arrays.asList("a", "b", "c"));
        map.put(3, Arrays.asList("d", "e", "f"));
        map.put(4, Arrays.asList("g", "h", "i"));
        map.put(5, Arrays.asList("j", "k", "l"));
        map.put(6, Arrays.asList("m", "n", "o"));
        map.put(7, Arrays.asList("p", "q", "r", "s"));
        map.put(8, Arrays.asList("t", "u", "v"));
        map.put(9, Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() < 1) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        res.add("");
        for(int i = 0; i < digits.length(); i++){
            res = createList(res, digits.charAt(i) - '0');
        }return res;
    }

    static List<String> createList(List<String> ls, int n){
        List<String> res = new ArrayList<>();
        for(String s1: ls){
            for(String s2: map.get(n)){
                res.add( s1 + s2);
            }
        }return res;
    }
}