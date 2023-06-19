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

public class PalindromeLinkedList {
    @Test
    public void test1() {
        ListNode head = createLinkedList(new int[]{1, 2, 2, 1});
        boolean expected = true;
        assertEquals(expected, isPalindrome(head));
    }

    @Test
    public void test2() {
        ListNode head = createLinkedList(new int[]{1, 2});
        boolean expected = false;
        assertEquals(expected, isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode reversedSecondHalf = reverseLinkedList(middle.next);
        
        ListNode p1 = head;
        ListNode p2 = reversedSecondHalf;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
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
