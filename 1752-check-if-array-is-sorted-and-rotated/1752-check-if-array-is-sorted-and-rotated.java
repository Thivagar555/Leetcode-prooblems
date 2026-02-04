class Solution {
    public boolean check(int[] nums) {
       // had tried left rotate but it fails while duplicates present in array
       //2. had tried find peak value but this also fails in duplicate case
       //core logic every array which has sorted and rotated it has only one drop for eg: [3,4,5,1,2] here 5>1 
    //    there can be at most one drop

    int drops = 0;
    int n = nums.length;

    for(int i=0; i<n; i++)
    {
        //if it is sorted and rotated then it is circular 
        //wee need to check the last value with first value
        // n = 5 , i=(4+1)%5 = 0 (first index)
        if(nums[i] > nums[(i+1)%n])
        {
            drops++;
            if(drops > 1) return false;
        }
    }
    return true;
    }
}