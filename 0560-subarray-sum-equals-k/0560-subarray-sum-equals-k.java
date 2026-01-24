class Solution {
    //4️⃣ Prefix Sum + HashMap ✅ (BEST & OFFICIAL)
//Track prefix sums seen so far
//this handles the -ve values also
    public int subarraySum(int[] nums, int k) {
//         At every index, I want to know
// how many earlier points make the remaining sum equal to k
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        int count = 0;
        int prefixSum = 0;

        for(int i=0; i<nums.length; i++)
        {
            prefixSum += nums[i];

            if(map.containsKey(prefixSum - k))
            {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;

    }
}
//prefixSum[i] - prefixSum[j] = k --heart logic of this problem
//prefixSum[j] = prefixSum[i] - k; --rearranging to our convinience
