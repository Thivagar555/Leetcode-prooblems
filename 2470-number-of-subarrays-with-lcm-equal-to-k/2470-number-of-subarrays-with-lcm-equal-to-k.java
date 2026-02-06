class Solution {
    public int subarrayLCM(int[] nums, int k) {
       int count = 0;
       //basic 0(n*m) approach 
       //from each i we are iterating to find the lcm equals to k and if it get larger than k we pruned the looop 
       for(int i = 0; i< nums.length; i++)
       {
            int currLcm = 1;
            for(int j = i; j< nums.length; j++)
            {
                currLcm = lcm(currLcm, nums[j]);
                if(currLcm == k)
                {
                    count ++;
                }
                else if(currLcm > k)
                {
                    break; //important pruning
                }
            }
       }
        return count;
    }
    static int lcm(int a, int b)
    {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }
    static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}