class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack();
        String[] dir = path.split("/");
        for(int i = 0; i< dir.length; i++){
            if(dir[i].equals("") || dir[i].equals(".")){
                continue;
            }if(dir[i].equals("..")){
                if(!s.empty()){
                    s.pop();
                }continue;
            }
            s.push(dir[i]);
        }
        StringBuilder r = new StringBuilder();
        for (String str : s) {
            r.append("/").append(str);
        }

        return r.length() == 0 ? "/" : r.toString();
    }
}