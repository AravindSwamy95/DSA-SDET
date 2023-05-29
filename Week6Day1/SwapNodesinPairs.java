package DSA;

import org.junit.Test;

public class SwapNodesinPairs {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = head;

            while (curr != null && curr.next != null) {
                ListNode first = curr;
                ListNode second = curr.next;

                prev.next = second;
                first.next = second.next;
                second.next = first;

                prev = first;
                curr = first.next;
            }

            return dummy.next;
        }
    }

    public static class TestSolution {
        @Test
        public void example1() {
            ListNode head = createLinkedList(new int[]{1, 2, 3, 4});
            ListNode result = new Solution().swapPairs(head);
            printLinkedList(result); // Output: 2 -> 1 -> 4 -> 3
        }

        @Test
        public void example2() {
            ListNode head = null;
            ListNode result = new Solution().swapPairs(head);
            printLinkedList(result); // Output: null
        }

        @Test
        public void example3() {
            ListNode head = createLinkedList(new int[]{1});
            ListNode result = new Solution().swapPairs(head);
            printLinkedList(result); // Output: 1
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
