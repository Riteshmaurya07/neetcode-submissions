class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String>list=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
