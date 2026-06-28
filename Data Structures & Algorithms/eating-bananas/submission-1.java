class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;
        int r=0;
        for (int pile : piles) {
             r = Math.max(r, pile);
        }
        while(l<r){
            int mid=(l+r)/2;
            if(check(piles, mid, h)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    private static boolean check(int[]piles, int val, int h){
        int count=0;
        for(int num:piles){
            count+=num/val;
            if(num%val!=0){
                count++;
            }
        }
        return count<=h;
    }
}
