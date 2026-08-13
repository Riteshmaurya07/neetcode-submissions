class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        boolean[] vis = new boolean[128];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (vis[s.charAt(i)]) {
                vis[s.charAt(left)] = false;
                left++;
            }
            vis[s.charAt(i)] = true;
            right++;
            max = Math.max(max, right - left);
        }
        return max;
    }
}
