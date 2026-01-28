class Solution {
    public int[][] merge(int[][] intervals) {
// sort the array based on start pos
//core logic = compare the current end with next start if
//it is lesser than  current end then set the current end
// to next end and add it to list;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        int[] curr = intervals[0];

        for(int i =1; i<intervals.length; i++)
        {
            int[] next = intervals[i];

            if(curr[1] >= next[0])
            {
                curr[1] = Math.max(next[1], curr[1]);
            }
            else
            {
                res.add(curr);
                curr = next;
            }
        }
        res.add(curr);

        return res.toArray(new int[res.size()][2]);

    }
}