class Solution {
    public int maxProfit(int[] prices) {
        int cp=prices[0];
        int max=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            max=Math.max(max,prices[i]-cp);
        }
        return max;
    }
}
