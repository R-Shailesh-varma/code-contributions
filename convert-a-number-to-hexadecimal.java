class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder st = new StringBuilder();
        long k = num;
        if(num < 0){
            k =(long)(Math.pow(2,32))+ num;
        }
        while(k != 0){
            int dig =(int)(k%16);
            st.append(map[dig]);
            k /= 16;
        }return st.reverse().toString();
    }
}