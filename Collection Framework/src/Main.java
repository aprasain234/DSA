
public class Main {
    public static void main(String[] args) {

        /**
         * ==========================================================================================================================
         * Collections Quick Reference (DSA Interview Edition)
         * ==========================================================================================================================
         *
         * +---------------+-----------+-------------------------------------+------------------+-------+------------------------------------------------+
         * | Collection    | Interface | Key Methods                         | Time (Avg)       | Space | DSA Interview Notes & Use Case                 |
         * +---------------+-----------+-------------------------------------+------------------+-------+------------------------------------------------+
         * | ArrayList     | List      | add, get, set, size                 | O(1) get/add     | O(n)  | Amortized O(1) add. Best for random access.    |
         * | LinkedList    | List/Deque| offer, poll, peek, addFirst/Last    | O(1) ends        | O(n)  | Avoid in interviews; ArrayDeque has better     |
         * |               |           |                                     |                  |       | CPU cache locality.                            |
         * | HashMap       | Map       | put, get, containsKey, getOrDefault | O(1)             | O(n)  | Essential for frequency arrays, caching, and   |
         * |               |           |                                     |                  |       | O(1) lookups. Allows 1 null key.               |
         * | HashSet       | Set       | add, contains, remove               | O(1)             | O(n)  | Backed by HashMap. Use for duplicate tracking. |
         * | LinkedHashMap | Map       | put, get, removeEldestEntry         | O(1)             | O(n)  | Maintains insert order. Crucial for LRU Cache. |
         * | TreeMap       | Map       | put, floorKey, ceilingKey, firstKey | O(log n)         | O(n)  | Red-Black Tree. Best for range queries.        |
         * | TreeSet       | Set       | add, floor, ceiling, first          | O(log n)         | O(n)  | Ordered unique elements, closest smaller/larger|
         * | ArrayDeque    | Deque     | push, pop, offerLast, pollFirst     | O(1)             | O(n)  | Use for Stacks/Queues instead of Stack/Vector. |
         * | PriorityQueue | Queue     | offer, poll, peek                   | O(log n) ins/rem | O(n)  | Min-Heap by default. Top-K elements, Dijkstra. |
         * |               |           |                                     | O(1) peek        |       | Note: Building from a Collection is O(n).      |
         * | String        | N/A       | charAt, substring, indexOf, length  | O(1) charAt      | O(n)  | Immutable. O(n) for substring in modern Java.  |
         * | StringBuilder | N/A       | append, insert, delete, reverse     | O(1) amortized   | O(n)  | Mutable string operations. Always use in loops.|
         * +---------------+-----------+-------------------------------------+------------------+-------+------------------------------------------------+
         *
         * ==========================================================================================================================
         * Critical DSA Interview Pro-Tips:
         * ==========================================================================================================================
         * - Stack vs Deque: Always use `Deque<Type> stack = new ArrayDeque<>();` over the legacy `Stack` class.
         *   The legacy `Stack` extends `Vector` and carries unnecessary synchronization overhead.
         * - Array vs ArrayList: Use fixed `int[]` instead of `ArrayList<Integer>` when size is known to avoid autoboxing
         *   overhead and improve memory efficiency.
         * - PriorityQueue (Max Heap): To create a Max-Heap, pass a reverse comparator:
         *   `Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());`
         * - Sorting Complexities:
         *   - `Arrays.sort(primitives)` uses Dual-Pivot Quicksort (O(n log n) average, O(n^2) worst case).
         *   - `Arrays.sort(objects)` and `Collections.sort()` use Timsort (O(n log n) worst case, stable).
         * - Thread Safety: Standard collections are NOT thread-safe. If asked about concurrency, mention `ConcurrentHashMap`.
         */
    }
}