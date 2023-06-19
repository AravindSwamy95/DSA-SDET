package DSA;

import org.junit.Test;

public class RotateList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Time Complexity ---> O(n*m)
    // Space Complexity --> O(n)
    @Test
    public void addNode1() {
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(3);
        newNode.next.next.next = new Node(4);
        newNode.next.next.next.next = new Node(5);

        int k = 2;

        displayNode(rotateList(newNode, k));
    }

    @Test
    public void addNode2() {
        Node newNode = new Node(0);
        newNode.next = new Node(1);
        newNode.next.next = new Node(2);

        int k = 4;

        displayNode(rotateList(newNode, k));
    }

    @Test
    public void addNode3() {
        Node newNode = null;

        int k = 1;

        displayNode(rotateList(newNode, k));
    }

    private Node rotateList(Node newNode, int k) {
        int count = 0;
        Node head = newNode;
        // to handle null node
        if (head == null || head.next == null) {
            return head;
        } else {
            while (count < k) {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                Node tail = temp.next;
                tail.next = head;
                head = tail;
                temp.next = null;
                count++;
            }
        }

        return newNode;
    }

    private void displayNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
