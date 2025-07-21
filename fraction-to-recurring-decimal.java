class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder st = new StringBuilder();
        if(numerator > 0 ^ denominator > 0) st.append('-');
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        long q = num / den;
        long r = num % den;
        st.append(q);
        if(r == 0) return st.toString();
        st.append('.');
        HashMap<Long, Integer> map = new HashMap<>();
        while(r != 0){
            if(map.containsKey(r)){
                int pos = map.get(r);
                st.insert(pos, '(');
                st.append(')');
                break;
            }else{
                map.put(r, st.length());
                r *= 10;
                q = r / den;
                r = r % den;
                st.append(q);
            }
        }return st.toString();
    }
}