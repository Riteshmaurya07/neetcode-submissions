class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return solve(nums, target, 0, n-1);
    }
    private static int solve(int nums[], int target, int st, int end){
        int mid=st+(end-st)/2;
        if(st>end )return -1;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return solve(nums, target, st, mid-1);
        }

           return  solve(nums, target, mid+1,end );


    }
}
