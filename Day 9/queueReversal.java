class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        if (q.isEmpty()) return; 
        
        int last = q.remove();
        reverseQueue(q);
        q.add(last);
    }
}
//recursion method most optimal.