class Solution {
    public int majorityElement(int[] nums) {

        //this only works for more than the n/2 times 
        //Boyer - moore voting algorithm 
        // this fails when no majority element exist
        int candidate = 0, count = 0;

        for(int num : nums)
        {
            if(count == 0)
            {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }
}