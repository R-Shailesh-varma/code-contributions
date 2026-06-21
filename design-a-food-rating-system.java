class FoodRatings {

    class Info{
        String name;
        String cuisine;
        int prior;
        Info(String name, String cuisine, int p){
            this.prior = p;
            this.name = name;
            this.cuisine = cuisine;
        }

    }

    Map<String, Info> names;
    Map<String, PriorityQueue<Info>> cus;
    
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        names = new HashMap<>();
        cus = new HashMap<>();
        int n = foods.length;
        for(int i = 0; i < n; i++){
            Info cur = new Info(foods[i], cuisines[i], ratings[i]);
            names.put(foods[i], cur);
            if(cus.containsKey(cuisines[i])){
                cus.get(cuisines[i]).add(cur);
            }else{
                PriorityQueue<Info> pq = new PriorityQueue<>(
                    (a, b) -> {
                        if (a.prior != b.prior)
                            return b.prior - a.prior;
                        return a.name.compareTo(b.name);
                    }
                );
                pq.add(cur);
                cus.put(cuisines[i], pq);
            }
        }
    }
    
    public void changeRating(String food, int newRating) {
        Info prev = names.get(food);
        Info curr= new Info(food,prev.cuisine,newRating);
        names.put(food,curr);
        prev.name="";
        cus.get(prev.cuisine).add(curr);
    }
    
    public String highestRated(String cuisine) {
        while( cus.get(cuisine).peek().name.equals("")){
            cus.get(cuisine).remove();
        }
        return cus.get(cuisine).peek().name;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */