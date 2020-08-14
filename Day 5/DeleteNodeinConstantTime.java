
// Definition for singly-linked list.
class ListtNode {
    int val;
    ListNode next;
    ListtNode(int x) { val = x; }
}

class SolutionofdeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
    node.next = node.next.next;
    }
}