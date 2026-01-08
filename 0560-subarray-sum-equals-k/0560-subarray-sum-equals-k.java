class Solution {
    //4️⃣ Prefix Sum + HashMap ✅ (BEST & OFFICIAL)
//Track prefix sums seen so far
//this handles the -ve values also
    public int subarraySum(int[] nums, int k) {
//         At every index, I want to know
// how many earlier points make the remaining sum equal to k
        Map<Integer, Integer> map = new HashMap<>();
       // Base case: prefix sum = 0 occurs once
        map.put(0,1);
        int count = 0;
        int sum =0;

        for(int i : nums)
        {
            //prefix sum
            sum += i;

            //sum-k == 0 then the subbarray is found or
            //follows the heart logic written in down;
            if(map.containsKey(sum-k))
            {
                count += map.get(sum-k);
            }
            
        //recording each sum and its occurance until i prefixsum
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
//prefixSum[i] - prefixSum[j] = k --heart logic of this problem
//prefixSum[j] = prefixSum[i] - k; --rearranging to our convinience
