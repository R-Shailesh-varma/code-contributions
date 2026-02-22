class Solution {
    class DSU{
        Map<String, String> parent; 
        Map<String, Double> weights;

        DSU(){
            parent = new HashMap<>();
            weights = new HashMap<>();
        }

        public void add(String s){
            if(!parent.containsKey(s)){
                parent.put(s, s);
                weights.put(s, 1.0);
            }
        }

        public String find(String s){
            if(!parent.get(s).equals(s)){
                String originalParent = parent.get(s);
                String root = find(originalParent);
                weights.put(s, weights.get(s) * weights.get(originalParent));
                parent.put(s, root);
            }return parent.get(s);
        }

        public void union(String a, String b, double val){
            add(a);
            add(b);
            String rootA = find(a);
            String rootB = find(b);

            if(!rootA.equals(rootB)){
                parent.put(rootA, rootB);
                double ratio = val * weights.get(b) / weights.get(a);
                weights.put(rootA, ratio);
            }
        }

        public double ratio(String a, String b){
            if(!parent.containsKey(a) || !parent.containsKey(b)) return -1.0;
            
            String rootA = find(a);
            String rootB = find(b);
            
            if(!rootA.equals(rootB)){
                return -1.0;
            }

            return weights.get(a) / weights.get(b);
        }

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        DSU unFin = new DSU();
        for(int i = 0; i < equations.size(); i++){
            unFin.union(equations.get(i).get(0), equations.get(i).get(1), values[i]);
        }
        int n = queries.size();
        double[] ans = new double[n];
        for(int i = 0; i < n; i++){
            ans[i] = unFin.ratio(queries.get(i).get(0), queries.get(i).get(1));
        }

        return ans;
    }

}