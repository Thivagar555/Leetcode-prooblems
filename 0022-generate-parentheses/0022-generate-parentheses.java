class Solution {
    public List<String> generateParenthesis(int n) {
        //backtracking 
        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);
        return result;
    }
    private static void backtrack(List<String> result, String current, int open, int close, int n)
    {
        //if the n=3 then it will be 3 open brackets and 3 closed so it is 2*n;
        if(current.length()==2*n)
        {
            result.add(current);
            return;
        }
        
       // Try to add '(' if we still can
        if(open < n)
        {
            backtrack(result, current + "(", open+1, close, n);
        }
        
        // Try to add ')' if it won't break validity
        if(close < open)
        {
            backtrack(result, current + ")", open, close+1, n);
        }
    }
}