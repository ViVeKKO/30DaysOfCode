
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int count = 1;
        ListNode tail = head;
        
        while(tail.next != null){
            count++;
            tail = tail.next;
        }
        tail.next = head;
        int newHeadIndex = count - k % count;

        for(int i = 0; i < newHeadIndex; i++){
            tail = tail.next;
        }
        
        head = tail.next;
        tail.next = null;

        return head;
    }
}