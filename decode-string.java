class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> st = new Stack<>();
        Stack<Integer> sn = new Stack<>();
        int n = 0;
        StringBuilder sb = new StringBuilder();
        for(char i: s.toCharArray()){
            if(Character.isDigit(i)){    
                n = n*10 + (i - '0');
            }else if(i == '['){
                sn.push(n);
                n = 0;
                st.push(sb);
                sb = new StringBuilder();
            }else if(i == ']'){
                int num = sn.pop();
                StringBuilder temp = sb;
                sb = st.pop();
                while(num-- > 0){
                    sb.append(temp);
                }
            }else{
                sb.append(i);
            }
        }return sb.toString();
    }
}