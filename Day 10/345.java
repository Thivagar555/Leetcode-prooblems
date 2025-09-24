//345. Reverse Vowels of a String
class Solution {
    public String reverseVowels(String s) {
        int slow = 0, fast = s.length()-1;
        StringBuilder sb = new StringBuilder(s);

        while(slow<=fast)
        {
            if( isVowel(s.charAt(slow)) )
            {
                if( isVowel(s.charAt(fast)))
                {
                    char ch = s.charAt(fast);
                    sb.setCharAt(fast, s.charAt(slow));
                    sb.setCharAt(slow, ch);
                    slow++; fast--;
                }
                else fast--;
            }
            else slow++;
        }
        return sb.toString();
    }
    public boolean isVowel(char ch)
    {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
        || ch == 'i' || ch == 'o' || ch == 'u' ) return true;
        else 
        return false;
    }
}