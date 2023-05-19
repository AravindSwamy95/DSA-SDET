package DSA;

public class ImplemetationOfDoubly {
	
	    private ListNode head;
	    private ListNode tail;
	    private int size;

	    public int get(int index) {
	        ListNode current;

	        if (index < size() / 2) {
	            current = head;
	            int count = 0;

	            while (current != null) {
	                if (count == index) {
	                    return current.val;
	                }
	                current = current.next;
	                count++;
	            }
	        } else {
	            current = tail;
	            int count = size() - 1;

	            while (current != null) {
	                if (count == index) {
	                    return current.val;
	                }
	                current = current.prev;
	                count--;
	            }
	        }

	        throw new IndexOutOfBoundsException("Index out of range");
	    }

	    private int size() {
		
			return size;
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

	 

	    private class ListNode {
	        int val;
	        ListNode prev;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	        }
	    }
	}

}
