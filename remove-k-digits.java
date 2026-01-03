class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();

        for (char c : num.toCharArray()) {
            while (!s.isEmpty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while(k > 0 && !s.isEmpty()){
            s.pop();
            k--;
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
        int idx = 0;
        while(idx < sb.length() && sb.charAt(idx) == '0'){
            idx++;
        }
        String ans = sb.substring(idx);
        return ans.length() <= 0 ? "0" : ans;
       
    }
}