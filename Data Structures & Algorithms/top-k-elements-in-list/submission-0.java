class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int num:nums ){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for(int key:hm.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int ans[]=new int[k];
        for(int i=k-1; i>=0; i--){
            ans[i]=pq.remove();
        }
        return ans;
        
    }
}
