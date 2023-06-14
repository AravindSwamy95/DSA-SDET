package DSA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveDuplicatesFromSortedList {
    @Test
    public void test1() {
        ListNode head = createLinkedList(new int[]{1, 1, 2});
        ListNode expected = createLinkedList(new int[]{1, 2});
        assertEquals(expected, deleteDuplicates(head));
    }

    @Test
    public void test2() {
        ListNode head = createLinkedList(new int[]{1, 1, 2, 3, 3});
        ListNode expected = createLinkedList(new int[]{1, 2, 3});
        assertEquals(expected, deleteDuplicates(head));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int value : values) {
            curr.next = new ListNode(value);
            curr = curr.next;
        }

        return dummy.next;
    }
}
