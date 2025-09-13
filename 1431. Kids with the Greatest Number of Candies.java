class Solution {
    public int greatest(int[] candies){
        int max = candies[0];
        for(int item: candies){
            max = max > item? max: item;
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = greatest(candies);
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i] + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
