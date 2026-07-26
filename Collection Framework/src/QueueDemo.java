import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        /*
        Queue
        Core Operations & Time Complexities
        enqueue(item): Adds an item to the rear of the queue.
            Array implementation: O(1) amortized (or O(n) if resizing).
            Linked List implementation: O(1) (if maintaining a tail pointer).
        dequeue(): Removes and returns the item from the front of the queue.
            Array implementation: O(n) if shifting elements, but O(1) if using a circular array/two pointers.
            Linked List implementation: O(1)
        .peek() / front(): Views the front item without removing it — O(1)
        .isEmpty(): Checks if the queue is empty — O(1)
        .size(): Returns the number of elements — O(1).
         */


        /*
        When should a Queue pop into your head during an interview or competitive programming? Look for these patterns:

        Pattern A: Breadth-First Search (BFS) / Level-Order Traversals
        Clues: "Find the shortest path in an unweighted graph/grid", "Traverse a tree level by level", "Find the minimum steps to reach a target".
        Why a Queue? BFS explores nodes level by level (expanding outward evenly). A queue ensures that nodes closer to the starting point are processed before nodes further away.
        Classic Problems:
            Binary Tree Level Order Traversal
            Rotting Oranges (Multi-source BFS)
            Word Ladder

        Pattern B: Processing in Order (FIFO / Streaming)
        Clues: "Requests must be handled in the order they arrive", "Simulate a waiting room or buffer".
        Classic Problems:
            Design Circular Queue / Queue using Stacks
            Recent Counter (tracking requests in a time window)

        Pattern C: Sliding Window Maximum / Monotonic Queue
        Clues: "Find the maximum/minimum in every sliding window of size $k$.
        "Why a Queue? A standard queue keeps elements in FIFO order, but a Monotonic Queue maintains elements in a strictly increasing or decreasing order by popping elements from
        the back that are smaller/larger than the incoming element. This optimizes sliding window problems from $O(n \times k)$ down to $O(n)$.
         */


        // 1. Initialize the Queue using ArrayDeque
        Queue<Integer> queue = new ArrayDeque<>();

        // 2. Enqueue using offer() - returns true if successful
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue size: " + queue.size()); // Output: 3

        // 3. Peek at the front element without removing it using peek()
        System.out.println("Front element is: " + queue.peek()); // Output: 10

        // 4. Dequeue using poll() - removes and returns the front, or returns null if empty
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        // Queue is now empty. poll() safely returns null instead of throwing an error.
        System.out.println("Polling empty queue: " + queue.poll()); // Output: null




    }
}
