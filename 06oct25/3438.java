class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
   
        for(int i =0; i<s.length(); i++)
        {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i =1; i<s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(i-1))
            {
                if(freq.get(s.charAt(i))  == s.charAt(i)-'0' && freq.get(s.charAt(i-1)) == s.charAt(i-1)-'0') return s.substring(i-1, i+1);
            }
        }
        return "";
    }
}