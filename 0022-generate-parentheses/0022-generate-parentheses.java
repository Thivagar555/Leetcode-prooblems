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
        // give IMPORTANT HERE 
        if(close < open)
        {
            backtrack(result, current + ")", open, close+1, n);
        }
    }
}
// this is how it forms in order of backtracking
// [
//  "((()))", backtrack to - "(()"
// open=2 close=1
// "(()("
// open=3 close=1
// "(()()"
// open=3 close=2
// "(()())"
// open=3 close=3

//  "(()())", Backtrack to "(()" then try add close 
//  "(())()",
//  "()(())",
//  "()()()"
// ]
