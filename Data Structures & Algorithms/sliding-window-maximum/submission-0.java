class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []ans=new int[nums.length-k+1];
        PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }
        int j=0;
        ans[j]=pq.peek();
        for(int i=k; i<nums.length; i++){
            pq.remove(nums[j++]);
            pq.add(nums[i]);
            ans[j]=pq.peek();
        }
        return ans;
    }
}
