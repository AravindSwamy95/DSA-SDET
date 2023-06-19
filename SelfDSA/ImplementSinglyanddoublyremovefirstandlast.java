package DSA;

public class ImplementSinglyanddoublyremovefirstandlast {
	class ListNode {
	    int val;
	    ListNode next;

	    public ListNode(int val) {
	        this.val = val;
	    }
	}

	class DoublyListNode {
	    int val;
	    DoublyListNode prev;
	    DoublyListNode next;

	    public DoublyListNode(int val) {
	        this.val = val;
	    }
	}

	class SinglyLinkedList {
	    private ListNode head;

	    public void add(int val) {
	        ListNode newNode = new ListNode(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            ListNode current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public void removeFirst() {
	        if (head != null) {
	            head = head.next;
	        }
	    }

	    public void removeLast() {
	        if (head == null || head.next == null) {
	            head = null;
	        } else {
	            ListNode current = head;
	            while (current.next.next != null) {
	                current = current.next;
	            }
	            current.next = null;
	        }
	    }
	}

	class DoublyLinkedList {
	    private DoublyListNode head;
	    private DoublyListNode tail;

	    public void add(int val) {
	        DoublyListNode newNode = new DoublyListNode(val);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            newNode.prev = tail;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void removeFirst() {
	        if (head != null) {
	            head = head.next;
	            if (head != null) {
	                head.prev = null;
	            } else {
	                tail = null;
	            }
	        }
	    }

	    public void removeLast() {
	        if (tail != null) {
	            tail = tail.prev;
	            if (tail != null) {
	                tail.next = null;
	            } else {
	                head = null;
	            }
	        }
	    }
	}


}
