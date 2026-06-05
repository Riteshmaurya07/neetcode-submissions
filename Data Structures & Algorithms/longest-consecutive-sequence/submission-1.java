class Solution {
    public int longestConsecutive(int[] nums) {
     TreeSet<Integer>ts=new TreeSet<>();
     if(nums.length==0){
        return 0;
     }
     for(int i=0; i<nums.length; i++){
        ts.add(nums[i]);
     }   
     int j=0;
     for(int key:ts){
        nums[j++]=key;
     }
     int count=1;
     int max= 1;
     for(int i=1;i<nums.length; i++){
        if(nums[i]==nums[i-1]+1){
            count++;
        }else{
            count=1;
        }
        max=Math.max(max,count);
     }
     return max;
    }
}
