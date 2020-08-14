public class MiddleOfLinkedListUsingSlowAndFastPointers {
    class ListNode{
        private ListNode next;
        public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        }
    }
}