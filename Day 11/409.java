class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : s.toCharArray())
        {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        int result = 0;
        boolean hasOdd = false;

        for(int value : freq.values() )
        {
            if(value%2==0)
            {
                result += value;
            }
            else
            {
                result += value-1;
                hasOdd = true;
            }
        }
        if(hasOdd) return result+1;
        return result;

    }
}