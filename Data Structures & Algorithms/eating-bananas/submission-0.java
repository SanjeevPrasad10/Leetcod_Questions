class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(high,pile);
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(canPile(piles,h,mid)){
                high = mid-1;//Eating too fast slow down
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }


    public boolean canPile(int[]piles,int h,int speed){
        long hours = 0;
        for(int pile:piles){
            hours += (pile + speed -1)/speed;
        }
        return hours<=h;
    }
}