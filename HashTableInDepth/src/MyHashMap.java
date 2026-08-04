

class MyHashMap {

    // 1. Define the LinkedList node
    private class ListNode {
        int key, val;
        ListNode next;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private final int SIZE = 1000;
    private ListNode[] buckets;

    public MyHashMap() {
        buckets = new ListNode[SIZE];
        // Fill every bucket with a "dummy" node to make
        // inserting and deleting easier (no null-pointer checks for empty buckets)
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new ListNode(-1, -1);
        }
    }

    // Helper function to keep our math clean
    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        ListNode curr = buckets[index];

        // Walk down the linked list to see if the key already exists
        while (curr.next != null) {
            if (curr.next.key == key) {
                // Key exists! Update the value and stop.
                curr.next.val = value;
                return;
            }
            curr = curr.next;
        }

        // If we reach the end and didn't find the key, add it to the end.
        curr.next = new ListNode(key, value);
    }

    public int get(int key) {
        int index = hash(key);
        // Skip the dummy node and start at the first real pair
        ListNode curr = buckets[index].next;

        // Walk down the list looking for the key
        while (curr != null) {
            if (curr.key == key) {
                return curr.val;
            }
            curr = curr.next;
        }

        // Key was never found
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        ListNode curr = buckets[index];

        // Walk down the list looking ahead (curr.next)
        // We look ahead so we can easily "skip over" the node we want to delete
        while (curr != null && curr.next != null) {
            if (curr.next.key == key) {
                // Bypass the matching node, effectively deleting it
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}