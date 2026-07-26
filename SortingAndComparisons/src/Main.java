import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sort primitive array
        int[] nums = {3, 1, 4, 1, 5};
        Arrays.sort(nums); // [1, 1, 3, 4, 5]

        // Sort a portion of an array (index 1 to 3, exclusive)
        Arrays.sort(nums, 1, 4);

        // Sort a list
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4));
        Collections.sort(list);
        // Or equivalently:
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        /*
        For custom sorting, Java uses Comparator with lambda expressions. The comparator receives two elements and returns a negative number if the first should come before the
        second, zero if they are equal, and a positive number if the first should come after.
         */
        // Sort intervals by start time (merge intervals pattern)
        int[][] intervals = {{1,3}, {2,6}, {8,10}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Sort strings by length, then alphabetically for ties
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) return Integer.compare(a.length(), b.length());
            return a.compareTo(b);
        });

        // Equivalent using Comparator chaining (cleaner for multi-key sorts)
        Arrays.sort(words, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));


        // For descending order:
        // Sort Integer array in descending order
        Integer[] nums = {3, 1, 4};
        Arrays.sort(nums, Collections.reverseOrder());

        // Sort list in descending order
        list.sort(Collections.reverseOrder());

        // Note: Collections.reverseOrder() does not work with primitive arrays.
        // For primitive int[], sort ascending then reverse manually,
        // or use Integer[] instead.
    }
}