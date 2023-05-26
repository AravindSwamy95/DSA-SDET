package DSA;
import org.junit.Test;

public class RemoveLinkedListElements {


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return dummy.next;
    }
}

public class TestSolution {
    @Test
    public void example1() {
        ListNode head = createLinkedList(new int[]{1, 2, 6, 3, 4, 5, 6});
        int val = 6;
        ListNode result = new Solution().removeElements(head, val);
        printLinkedList(result); // Output: 1 -> 2 -> 3 -> 4 -> 5
    }

    @Test
    public void example2() {
        ListNode head = null;
        int val = 1;
        ListNode result = new Solution().removeElements(head, val);
        printLinkedList(result); // Output: null
    }

    @Test
    public void example3() {
        ListNode head = createLinkedList(new int[]{7, 7, 7, 7});
        int val = 7;
        ListNode result = new Solution().removeElements(head, val);
        printLinkedList(result); // Output: null
    }

    private ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    private void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


}
