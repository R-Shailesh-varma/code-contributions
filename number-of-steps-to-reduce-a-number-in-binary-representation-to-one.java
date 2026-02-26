class Solution {
    public int numSteps(String s) {
        int i = s.length()-1;
        int count = 0;
        while(!s.equals("1")){
            if(s.charAt(i) == '0'){
                s = even(s);
            }else{
                s = odd(s);
            }
            count++;
            i = s.length()-1;
        }return count;
    }
    private String even(String s){
        return s.substring(0, s.length()-1);
    }

    private String odd(String s){
        StringBuilder sb = new StringBuilder();
        int carry = 1;
        for(int i = s.length()-1; i >= 0; i--){
            int sum = (s.charAt(i) - '0') + carry;
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}