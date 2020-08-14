
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfYLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = 0,lb = 0;
        ListNode ha = headA,hb= headB;
        while(ha!=null){
            ++la;
            ha = ha.next;
        }
        while(hb!=null){
            ++lb;
            hb = hb.next;
        }
        if(la>lb){
            while(la--!=lb) headA = headA.next;
        }
        else if(lb>la){
            while(lb--!=la) headB = headB.next;
        }
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headB;
        
        
    }
}