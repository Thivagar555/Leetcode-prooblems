class Solution {
    public boolean isSubsequence(String s, String t) {
       int i = 0;
       int j = 0;
       if(s.length()==0) return true;

       while(j<t.length() && i<s.length())
       {
          if(t.charAt(j) == s.charAt(i))
          {
            i++; 
            j++;
          }
          else
          {
            j++;
          }
       }
       return i==s.length();
    }
}