class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0){
         return 0;
      }
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums){
         hs.add(num);
        }
        int count=1;
        int max=1;
        for(int num:hs){
         if(!hs.contains(num-1)){
            while(hs.contains(num+1)){
               count++;
               num=num+1;
            }
            max=Math.max(max,count);
            count=1;
         }
        }
        return max;
    }
}
