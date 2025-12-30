class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        helper(s, 0, ans, new StringBuilder());
        return ans;
    }public void helper(String s, int idx, List<String> ans, StringBuilder sb){
        if(idx == s.length()){
            ans.add(sb.toString());
            return;
        }
        if(Character.isLetter(s.charAt(idx))){
            char letter = s.charAt(idx);
            sb.append(Character.toLowerCase(letter));
            helper(s, idx+1, ans, sb);
            sb.deleteCharAt(sb.length()-1);
            
            sb.append(Character.toUpperCase(letter));
            helper(s, idx+1, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(s.charAt(idx));
            helper(s, idx+1, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}