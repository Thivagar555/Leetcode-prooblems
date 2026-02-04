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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();

        for(ListNode node : lists)
        {
            while(node != null)
            {
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int i=0; i<list.size() ; i++)
        {
            ListNode temp = new ListNode(list.get(i));
            current.next = temp;
            current = current.next;
        }
        return dummy.next;
    }
}