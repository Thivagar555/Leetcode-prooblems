class Solution {
    public boolean hasSameDigits(String s) {
        
        int[] num = new int[s.length()];

        for(int i =0 ; i<num.length; i++)
        {
            num[i]=s.charAt(i)-'0';
        }
        int len = num.length;
        
        while(len>2)
        {
            for(int i =0; i<len-1; i++)
            {
               num[i] =( num[i] + num[i+1] ) %10;
              
            }
            len--;
        }
        return num[0] == num[1];
    
    }
}