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
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode prevGroupEnd = dummy;

        while(true)
        {
            ListNode kth = prevGroupEnd;
             //finding whether it has k nodes to reverse
                for(int i =0; i<k && kth != null; i++)
                {
                    kth =  kth.next;
                }
                if(kth == null) break; //not enough nodes to reverse
             // Step 2: Reverse k nodes
            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;

            ListNode prev = nextGroupStart;
            ListNode curr = groupStart;
            
            while(curr != nextGroupStart)
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            //connecting the 
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
     
    }
}
// | Pointer          | Who it is                 | Meaning                        |
// | ---------------- | ------------------------- | ------------------------------ |
// | `prevGroupEnd`   | node **before** the group | connection point               |
// | `groupStart`     | **original first node**   | becomes **tail** after reverse |
// | `kth`            | **original last node**    | becomes **head** after reverse |
// | `nextGroupStart` | node after group          | start of next section          |

// prevGroupEnd always points before the group

// groupStart becomes the tail after reversal

// kth becomes the new head of the group

// nextGroupStart protects the rest of the list

// Dummy node avoids special handling of head