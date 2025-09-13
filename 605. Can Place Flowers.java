class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int toPlant = n;
        int len = flowerbed.length;
        for(int i=0;i<len;i++){
            if(flowerbed[i] == 0){
                //Either the index is 0 or the prev item was 0.
                boolean backCheck = (i == 0 || flowerbed[i-1] == 0);
                //Either the next index is n or the next item is 0.
                boolean frontCheck = (i == len-1 || flowerbed[i+1] == 0);
                //System.out.println(backCheck +" "+frontCheck);
                if(backCheck && frontCheck){
                    toPlant--;
                    flowerbed[i] = 1;
                }
            }
        }
        if(toPlant <= 0) return true;
        return false;
    }
}
