/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       //track the three nodes
       ListNode curr = head;
       ListNode prev = null;
       ListNode next;

       while(curr != null)
       {
        //store the next node
        next = curr.next;
        //reverse the order
          curr.next = prev;

//move the pointers 
          prev = curr;

          curr = next;
       }

       //curr node will point to null after completing while loop prev will point to the last node of the list
       return prev;
    }
}