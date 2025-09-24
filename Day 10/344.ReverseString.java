class Solution {
    public void reverseString(char[] s) {
       for(int slow= 0,  fast = s.length-1; slow<fast; slow++, fast--)
       {
            char temp =s[fast];
            s[fast]=s[slow];
            s[slow]=temp;
            
        }
    }
}