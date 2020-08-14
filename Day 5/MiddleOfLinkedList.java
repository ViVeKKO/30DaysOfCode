
// Definition for singly-linked list.
public class MiddleOfLinkedList {
    int val;
    MiddleOfLinkedList next;

    MiddleOfLinkedList() {
    }

    MiddleOfLinkedList(int val) {
        this.val = val;
    }

    MiddleOfLinkedList(int val, MiddleOfLinkedList next) {
        this.val = val;
        this.next = next;
    }
}

class SolutionCode {
    public MiddleOfLinkedList middleNode(MiddleOfLinkedList head) {
        MiddleOfLinkedList head2 = head;
        int count = 0;
        while(head2!=null){
            ++count;
            head2 = head2.next;
        }
        count = count/2+1;
        while(count-->1){
            head = head.next;
           
        }
        return head;
    }
}