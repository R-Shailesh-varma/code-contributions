class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (a, b) -> Compare(a, b));
        if(strs[0].equals("0")){
            return "0";
        }
        return String.join("", strs);
    }public int Compare(String s1, String s2){
        if(s1.equals(s2)){
            return 0;
        }
        int i = 0, j = 0;
        int l1 = s1.length(), l2 = s2.length();
        int k = l1*l2;
        while(k-- > 0){
            char c1 = s1.charAt(i++ % l1);
            char c2 = s2.charAt(j++ % l2);
            if(c1 == c2){
                continue;
            }
            return c2 - c1;
        }return 0;
    }
}