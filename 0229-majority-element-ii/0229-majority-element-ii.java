class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //boyer moore voting algorithm but with two
        // candidate and two count 
        //because it is possible to have atmost two candidates
        //more than n/3 counts
       int count1=0, count2 = 0;

       int candidate1 = 0, candidate2= 0;

       for(int num : nums)
       {
        if(num == candidate1)
        count1++;

        else if(num == candidate2)
        count2++;

        else if(count1==0)
        {
            candidate1 = num;
            count1 ++;
        }
        else if(count2 == 0)
        {
            candidate2 = num;
            count2++;
        }
        else
        {
            count1--;
            count2--;
        }
       }

       //now count doesn't matter only candidates are
       //now check if candidates counts are more than n/3
       count1 = 0;
       count2 = 0;
       for(int num : nums)
       {
            if(num == candidate1) count1++;
        
            else if(num == candidate2) count2++;
       }
       List<Integer> result = new ArrayList<>();
       if(count1 > nums.length/3) result.add(candidate1);
       if(count2 > nums.length/3) result.add(candidate2);
       return result;
    }
}