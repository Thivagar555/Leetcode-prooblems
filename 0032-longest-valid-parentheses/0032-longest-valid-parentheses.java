class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        //-1 because if the valid paranthesis start from zeroth index then it will help to calculate int len = i-stack.peek(); 
        //for eg: 4-(-1) = 5 

        // core logic = pushing the index of parenthesis if it equals = ( and pop if it equals = )
        //if stack is empty set the current index as base
        //or else the stack contains valid parenthesis find the len by doing int len = i-stack.peek();


        stack.push(-1);
        int n = s.length();
        int maxLen = 0;
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(i);
            }
            else
            {
                stack.pop();

                if(stack.isEmpty())
                {
                    stack.push(i);
                }
                else
                {
                    int len = i -stack.peek();
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;

    }
}