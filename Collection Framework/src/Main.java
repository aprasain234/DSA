
public class Main {
    public static void main(String[] args) {

        /**
         * ====================================================================================================================================
         * Collections Quick Reference (DSA Interview Edition)
         * ====================================================================================================================================
         *
         * +---------------+-----------+-------------------------------------------------------------+------------------+-------+------------------------------------------------+
         * | Collection    | Interface | Key Methods (Action)                                        | Time (Avg)       | Space | DSA Interview Notes & Use Case                 |
         * +---------------+-----------+-------------------------------------------------------------+------------------+-------+------------------------------------------------+
         * | ArrayList     | List      | add (append/insert), get (fetch by index),                  | O(1) get/add     | O(n)  | Amortized O(1) add. Best for random access.    |
         * |               |           | set (replace at index), size (element count)                |                  |       |                                                |
         * | LinkedList    | List/Deque| offer (enqueue), poll (dequeue and remove),                 | O(1) ends        | O(n)  | Avoid in interviews; ArrayDeque has better     |
         * |               |           | peek (view front), addFirst/Last (insert at ends)           |                  |       | CPU cache locality.                            |
         * | HashMap       | Map       | put (insert/update key-value), get (fetch value),           | O(1)             | O(n)  | Essential for frequency arrays, caching, and   |
         * |               |           | containsKey (check if key exists), getOrDefault (fallback)  |                  |       | O(1) lookups. Allows 1 null key.               |
         * | HashSet       | Set       | add (insert unique), contains (check exists),               | O(1)             | O(n)  | Backed by HashMap. Use for duplicate tracking. |
         * |               |           | remove (delete element)                                     |                  |       |                                                |
         * | LinkedHashMap | Map       | put (insert), get (fetch), removeEldestEntry (LRU eviction) | O(1)             | O(n)  | Maintains insert order. Crucial for LRU Cache. |
         * | TreeMap       | Map       | put (insert), floorKey (find ≤ key),                        | O(log n)         | O(n)  | Red-Black Tree. Best for range queries.        |
         * |               |           | ceilingKey (find ≥ key), firstKey (find min key)            |                  |       |                                                |
         * | TreeSet       | Set       | add (insert), floor (find ≤ val),                           | O(log n)         | O(n)  | Ordered unique elements, closest smaller/larger|
         * |               |           | ceiling (find ≥ val), first (find min val)                  |                  |       |                                                |
         * | ArrayDeque    | Deque     | push (stack insert), pop (stack remove),                    | O(1)             | O(n)  | Use for Stacks/Queues instead of Stack/Vector. |
         * |               |           | offerLast (queue insert), pollFirst (queue remove)          |                  |       |                                                |
         * | PriorityQueue | Queue     | offer (insert into heap), poll (remove top/root element),   | O(log n) ins/rem | O(n)  | Min-Heap by default. Top-K elements, Dijkstra. |
         * |               |           | peek (view top/root element without removing)               | O(1) peek        |       | Note: Building from a Collection is O(n).      |
         * | String        | N/A       | charAt (get character), substring (extract part),           | O(1) charAt      | O(n)  | Immutable. O(n) for substring in modern Java.  |
         * |               |           | indexOf (find sequence), length (character count)           |                  |       |                                                |
         * | StringBuilder | N/A       | append (add to end), insert (add at index),                 | O(1) amortized   | O(n)  | Mutable string operations. Always use in loops.|
         * |               |           | delete (remove part), reverse (flip sequence)               |                  |       |                                                |
         * +---------------+-----------+-------------------------------------------------------------+------------------+-------+------------------------------------------------+
         *
         * ====================================================================================================================================
         * Critical DSA Interview Pro-Tips:
         * ====================================================================================================================================
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