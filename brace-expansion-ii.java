class Solution {
    Stack<String> stack = new Stack();
    StringBuilder sb = new StringBuilder();
    List<String> res = new ArrayList<>();
    public List<String> braceExpansionII(String expression) {
        stack.push(expression);
        iter_dfs();
        Collections.sort(res);
        return res;
    }void iter_dfs(){
        while(!stack.isEmpty()){
            String s = stack.pop();
            if(s.indexOf('}') == -1){
                if(!res.contains(s)){
                    res.add(s);
                }continue;
            }
            int index = 0, left = 0, right = 0;
            while(s.charAt(index) != '}'){
                if(s.charAt(index++) == '{'){
                    left = index - 1;
                }
            }right = index;

            String bef = s.substring(0, left);
            String aft = s.substring(right+1, s.length());
            String[] args = s.substring(left+1, right).split(",");
            for(String dam: args){
                sb.setLength(0);
                sb.append(bef);
                sb.append(dam);
                sb.append(aft);
                stack.push(sb.toString());
            }
        }
    }
}