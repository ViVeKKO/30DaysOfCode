
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseRangeOfLinkedList {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr1 = dummy;
        for(int i=0;i<m-1;i++){
            ptr1 = ptr1.next;  //! Reach before the start node
        }
        ListNode ptr2 = ptr1.next;   //!Start here
        ListNode ptr3 = ptr2.next;   //!next pointer
        for(int i=0;i<n-m;i++){
            ptr2.next = ptr3.next;      //! Change ptr2 
            ptr3.next = ptr1.next;
            ptr1.next = ptr3;
            ptr3 = ptr2.next;
        }
        return dummy.next;
    }
}