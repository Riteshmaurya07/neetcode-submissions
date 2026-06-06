class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sb=new StringBuilder();
      s=s.toLowerCase();
       for(int i=0; i<s.length(); i++){
         if(isAlphanumeric(s.charAt(i))){
            sb.append(s.charAt(i));
         }
       } 
       s=sb.toString();
       int left=0;
       int right=s.length()-1;
       while(left<right){
         if(s.charAt(left++)!=s.charAt(right--)){
            return false;
         }
       }

       return true;
    }
    private static boolean isAlphanumeric(char ch){
      return Character.isDigit(ch) || Character.isLetter(ch);
    }
}
