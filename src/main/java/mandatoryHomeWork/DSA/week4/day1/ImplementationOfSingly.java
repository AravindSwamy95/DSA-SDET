package DSA;

public class ImplementationOfSingly {
	public class SingleLinkedList {
	    private ListNode head;

	    public int get(int index) {
	        ListNode current = head;
	        int count = 0;

	        while (current != null) {
	            if (count == index) {
	                return current.val;
	            }
	            current = current.next;
	            count++;
	        }

	        throw new IndexOutOfBoundsException("Index out of range");
	    }

	    public int indexOf(int element) {
	        ListNode current = head;
	        int index = 0;

	        while (current != null) {
	            if (current.val == element) {
	                return index;
	            }
	            current = current.next;
	            index++;
	        }

	        return -1;
	    }

	    // Other methods for adding, removing, etc. go here...

	    private class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	        }
	    }
	}


}
