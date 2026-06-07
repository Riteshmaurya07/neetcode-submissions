class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int lp=0; int rp=n-1;
        int max=0;
        while(lp<rp){
         int tempmax=Math.min(heights[lp], heights[rp])*(rp-lp);
         max=Math.max(max, tempmax);
         if(heights[lp]<heights[rp]){
            lp++;
         }else rp--;
        }
        return max;
    }
}
