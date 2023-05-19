package DSA;
import org.junit.Test;

	public class MergeTwoSortedLists {

	    // Time complexity: O(m + n), where m and n are the lengths of list1 and list2
	    // Space complexity: O(1)
	    @Test
	    public void example1() {
	        ListNode list1 = createLinkedList(new int[]{1, 2, 4});
	        ListNode list2 = createLinkedList(new int[]{1, 3, 4});
	        ListNode merged = mergeTwoLists(list1, list2);
	        printLinkedList(merged);
	    }

	    @Test
	    public void example2() {
	        ListNode list1 = null;
	        ListNode list2 = null;
	        ListNode merged = mergeTwoLists(list1, list2);
	        printLinkedList(merged);
	    }

	    @Test
	    public void example3() {
	        ListNode list1 = null;
	        ListNode list2 = createLinkedList(new int[]{0});
	        ListNode merged = mergeTwoLists(list1, list2);
	        printLinkedList(merged);
	    }

	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode dummy = new ListNode(0);
	        ListNode curr = dummy;

	        while (list1 != null && list2 != null) {
	            if (list1.val <= list2.val) {
	                curr.next = list1;
	                list1 = list1.next;
	            } else {
	                curr.next = list2;
	                list2 = list2.next;
	            }
	            curr = curr.next;
	        }

	        // Append remaining nodes
	        if (list1 != null) {
	            curr.next = list1;
	        }
	        if (list2 != null) {
	            curr.next = list2;
	        }

	        return dummy.next;
	    }

	    public ListNode createLinkedList(int[] values) {
	        ListNode dummy = new ListNode(0);
	        ListNode curr = dummy;

	        for (int value : values) {
	            curr.next = new ListNode(value);
	            curr = curr.next;
	        }

	        return dummy.next;
	    }

	    public void printLinkedList(ListNode head) {
	        ListNode curr = head;
	        while (curr != null) {
	            System.out.print(curr.val + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }

	    class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	        }
	    }
	}


