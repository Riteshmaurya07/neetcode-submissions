class Solution {
    public int maxArea(int[] heights) {
      int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=heights[0];
        right[n-1]=heights[n-1];
        for(int i=1; i<heights.length; i++){
         left[i]=Math.max(left[i-1],heights[i]);
         right[n-i-1]=Math.max(right[n-i],heights[n-i-1]);
        }
        int lp=0;
        int rp=n-1;
        int max=0;
          while(lp<rp){
            int tempmax=Math.min(left[lp],right[rp])*(rp-lp);
            max=Math.max(max,tempmax);
            if(left[lp]<right[rp]){
               lp++;
            }else{
               rp--;
            }
          }
          return max;
    }
}
