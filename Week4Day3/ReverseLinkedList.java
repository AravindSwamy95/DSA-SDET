package DSA;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    
    @Test
    public void example1() {
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode reversed = reverseList(head);
        printLinkedList(reversed); // Output: 5 -> 4 -> 3 -> 2 -> 1
    }
    
    @Test
    public void example2() {
        ListNode head = createLinkedList(new int[]{1, 2});
        ListNode reversed = reverseList(head);
        printLinkedList(reversed); // Output: 2 -> 1
    }
    
    @Test
    public void example3() {
        ListNode head = null;
        ListNode reversed = reverseList(head);
        printLinkedList(reversed); // Output: []
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // to create ll from array
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    // to print elts of ll
    private void printLinkedList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }

        System.out.println();
    }
}



