
//  * Definition for singly-linked list.
public class ReverseLinkedList {
    int val;
    ReverseLinkedList next;

    ReverseLinkedList() {
    }

    ReverseLinkedList(int val) {
        this.val = val;
    }

    ReverseLinkedList(int val, ReverseLinkedList next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ReverseLinkedList reverseList(ReverseLinkedList head) {
        ReverseLinkedList p1 = null;
        // ReverseLinkedList hd = head;
        while (head != null) {
            ReverseLinkedList p3 = head.next;
            head.next = p1;
            p1 = head;
            head = p3;
        }
        return p1;
    }
}
