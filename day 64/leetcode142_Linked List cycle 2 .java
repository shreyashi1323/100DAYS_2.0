public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }

        if (fast == null || fast.next == null) {
            return null; // No cycle found
        }

        ListNode temp=head;

        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }

        return slow;
    }
}
