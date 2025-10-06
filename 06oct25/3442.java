class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(int i =0; i<s.length(); i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        int odd =0;
        int even = s.length();
        for(int i=0; i<26; i++)
        {
            if(freq[i]==0) continue;

            if (freq[i] %2 != 0) odd=Math.max(odd, freq[i]);
            else
            {
               even=Math.min(even, freq[i]);
            }
        }
       // if(even == s.length()) return odd;
        return odd-even;
    }
}