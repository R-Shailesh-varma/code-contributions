class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int i: arr){
            int bc = Integer.bitCount(i);
            map.put(bc, map.getOrDefault(bc, new ArrayList<>()));
            map.get(bc).add(i);
        }
        int idx = 0;
        for(int i: map.keySet()){
            for(int j: map.get(i)){
                arr[idx++] = j;
            }
        }

        return arr;
    }
}