
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null)  slow = slow.next;
        slow = rev(slow);
        fast = head;
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
    }
    private static ListNode rev(ListNode head){
        ListNode ptr1 = null;
        while(head!=null){
            ListNode ptr3 = head.next;
            head.next = ptr1;
            ptr1 = head;
            head = ptr3;
        }
        return ptr1;
    }
}