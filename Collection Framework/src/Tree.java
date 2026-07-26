import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {

        /*
        1. The Underlying Data Structure: Red-Black TreeJava's TreeSet and TreeMap are backed by a Red-Black Tree, which is a self-balancing Binary Search Tree (BST).
        Self-balancing: Ensures that the tree height remains balanced, meaning operations like add, remove, and contains take O(\log n)$ time in the worst case.
        Sorted Order: Elements are stored in sorted order (either by their natural ordering or via a custom Comparator).

        2. TreeSet (java.util.TreeSet)A TreeSet implements the NavigableSet interface (which extends SortedSet).
            It contains a collection of unique elements stored in sorted order.
            Key Characteristics:
                No duplicates: Elements are unique (based on compareTo() or equals()).
                Sorted: Elements are automatically sorted.Not synchronized: Not thread-safe by default.
                Null values: Does not allow null elements if it uses natural ordering (it will throw a NullPointerException), unless a custom Comparator that handles null is provided.
         */
                Set<String> fruits = new TreeSet<>();
                fruits.add("Banana");
                fruits.add("Apple");
                fruits.add("Orange");
                fruits.add("Apple"); // Duplicate, ignored

                // Output will be automatically sorted alphabetically: [Apple, Banana, Orange]
                System.out.println(fruits);

                /*
                3. TreeMap (java.util.TreeMap)
                A TreeMap implements the NavigableMap interface (which extends SortedMap). It stores key-value pairs sorted by the keys.
                Key Characteristics:
                    Sorted by Key: Keys are kept in sorted order.
                    Unique Keys: Duplicate keys are not allowed (new value overwrites the old one).
                    Nulls: Does not allow null keys (throws NullPointerException), but allows null values.
                 */

                Map<Integer, String> students = new TreeMap<>();
                students.put(3, "Charlie");
                students.put(1, "Alice");
                students.put(2, "Bob");

                // Output will be sorted by key: {1=Alice, 2=Bob, 3=Charlie}
                System.out.println(students);
                /*
                4. Specialized Navigable Methods
                Because TreeSet and TreeMap implement NavigableSet and NavigableMap, they offer powerful navigation methods that standard lists or hash-based collections don't have:
                    lower(e) / higher(e): Strictly less than / strictly greater than e.
                    floor(e) / ceiling(e): Less than or equal to / greater than or equal to e.
                    headMap(toKey) / tailMap(fromKey): Sub-views of the map.
                    descendingSet() / descendingMap(): Views in reverse order.

                Summary:
                When should you use Trees?Use HashSet / HashMap when you need the fastest possible operations (O(1) average time) and don't care about order.
                Use TreeSet / TreeMap when you need elements to remain sorted, or when you need range-based queries (e.g., finding all items between two values).
                 */








            }
}
