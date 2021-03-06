
// Definition for singly-linked list.
public class MergeTwoSortedList {
    int val;
    MergeTwoSortedList next;

    MergeTwoSortedList() {
    }

    MergeTwoSortedList(int val) {
        this.val = val;
    }

    MergeTwoSortedList(int val, MergeTwoSortedList next) {
        this.val = val;
        this.next = next;
    }
}

class Solutionofyouknow {
    public MergeTwoSortedList mergeTwoLists(MergeTwoSortedList l1, MergeTwoSortedList l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        MergeTwoSortedList result = new MergeTwoSortedList(0);
        MergeTwoSortedList prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return result.next;
    }
}