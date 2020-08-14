
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class DeleteNthNodeFromEndOfLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode head2 = head;
        ListNode head3 = head;
        int count = 0;
        while(head2!=null){
            head2 = head2.next;
            ++count;
        }
        if(count == 1 && n==1){
            return null;
        }
        int stop = count - n;
        // while(s)
        for(int i=1;i<stop;i++){
            head3 = head3.next;
        }
        if(stop == 0){
            return head.next;
        }
        if(n!=1)
        head3.next = head3.next.next;
        else
            head3.next = null;
        return head;
        
            
    }
}