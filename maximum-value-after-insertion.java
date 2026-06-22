class Solution {
    public String maxValue(String n, int x) {
        StringBuilder sb = new StringBuilder(n);
        int idx = 0;
        boolean neg = false;
        if(n.length() > 1 && n.charAt(0) == '-'){
            idx = 1;
            neg = true;
        }

        while(idx < sb.length()){
            if(neg){
                if(n.charAt(idx)-'0' > x) break;
            }else if(n.charAt(idx)-'0' < x) break;
            idx++;
        }

        sb.insert(idx, x);
        return sb.toString();

    }
}