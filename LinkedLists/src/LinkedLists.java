//****************************************************
//LinkedList
//****************************************************
//===============================
import java.io.IOException;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) throws IOException {
        LinkedList<String> linkedList = new LinkedList<>();
        /*
        Linkedlist as Stack
        linkedList.push("Ashish");
        linkedList.push("Ashish1");
        linkedList.push("Ashish2");
        linkedList.push("Ashish4");
        // linkedlist acts as stack so will print as [Ashish4, Ashish2, Ashish1, Ashish]
        linkedList.pop();
        */
        // LinkedList as Queue
        linkedList.offer("Ashish");
        linkedList.offer("Ashish2");
        linkedList.offer("Ashish3");
        linkedList.offer("Ashish4");
        linkedList.offer("Ashish5");
        linkedList.poll();

        linkedList.add(3, "Random");
        linkedList.remove(3);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("ThisIsFirst");
        linkedList.addLast("ThisIsLast");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}
//--------------------------------------------------------------------------------------------------------------

// Doubly linked list
public class DoublyLinkedList {
    // Node has both 'next' and 'prev'
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;  // optional, but useful for reverse traversal

    // Insert at head
    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;  // new node points to old head
        node.prev = null;  // new head has no previous

        if (head != null) {
            head.prev = node;  // old head's prev now points back to new node
        } else {
            // list was empty, so tail is also this node
            tail = node;
        }

        head = node;
    }

    // Insert at tail (easy with 'prev' and 'tail')
    public void addLast(int value) {
        Node node = new Node(value);
        node.next = null;   // new tail's next is null
        node.prev = tail;   // link back to old tail

        if (tail != null) {
            tail.next = node;
        } else {
            // list was empty, so head is also this node
            head = node;
        }

        tail = node;
    }

    // Delete a node when you already have a reference to it
    public void deleteNode(Node node) {
        if (node == null) return;

        // If node is head
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }

        // If node is tail
        if (node.next == null) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }

        // 'node' is now unreferenced if caller also drops it
    }

    // Delete first occurrence of a value (for comparison with singly)
    public void deleteValue(int value) {
        Node curr = head;
        while (curr != null && curr.data != value) {
            curr = curr.next;
        }
        if (curr == null) return; // not found

        deleteNode(curr);
    }

    // Traverse forward
    public void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Traverse backward (uses 'prev' and 'tail')
    public void printBackward() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }
   // ------------------------------------------

    //     876. Middle of the Linked List
    //     Easy
    //     Given the head of a singly linked list, return the middle node of the linked list.
    //     If there are two middle nodes, return the second middle node.
    //     ListNode is not a built-in data type in Java (or most languages). It's a custom class that someone defined elsewhere in the code.

    int getMiddle(ListNode head) {
        // Count the total number of nodes
        int totalNodes = 0;
        ListNode current = head;
        while (current != null) {
            totalNodes++;
            current = current.next;
        }

        // Move to the middle node
        ListNode middleNode = head;
        for (int i = 0; i < totalNodes / 2; i++) {
            middleNode = middleNode.next;
        }

        return middleNode.val;
    }

    // ------------------------------------------------------------------------------------------------------------------





}

