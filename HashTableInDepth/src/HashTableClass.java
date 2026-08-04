import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

public class HashTableClass {

    public static void main(String[] args) {
        // Hashtable example
        // Hashtable is synchronized (thread-safe).
        // It does not allow null keys or null values.
        // It is generally slower than HashMap because of the synchronization overhead.
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);

        // Retrieving a value
        System.out.println("Hashtable example:");
        System.out.println("Value for key 'B': " + hashtable.get("B"));

        // The following lines would throw a NullPointerException
        // hashtable.put("D", null);
        // hashtable.put(null, 4);

        System.out.println("--------------------------");

        // HashMap example
        // HashMap is not synchronized (not thread-safe).
        // It allows one null key and multiple null values.
        // It is generally faster than Hashtable.
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("X", 10);
        hashMap.put("Y", 20);
        hashMap.put("Z", 30);

        // HashMap allows a null key and null values
        hashMap.put(null, 40);
        hashMap.put("W", null);

        // Retrieving a value
        System.out.println("HashMap example:");
        System.out.println("Value for key 'Y': " + hashMap.get("Y"));
        System.out.println("Value for null key: " + hashMap.get(null));
        System.out.println("Value for key 'W': " + hashMap.get("W"));

        // Iterating through the HashMap
        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("-----------------------------------------------------------");
        // Variant 1: Single Frequency Map: Count frequency of each element
        int[] nums = {1,2,3,3,4,5,6,6,6,7,8,8,8,8,9,9};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);

        System.out.println("-----------------------------------------------------------");
        // Variant 2: Two Frequency Maps Comparison
     /*   String s1 = "listen";
        String s2 = "silent";
        // Check if two strings are anagrams
        Map<Character, Integer> freq1 = buildFrequencyMap(s1);
        Map<Character, Integer> freq2 = buildFrequencyMap(s2);
        return freq1.equals(freq2);


        Hers is the logical implementation of above method:
        public static Map<Character, Integer> buildFrequencyMap(String word) {
    // 1. Create the blank tally sheet
    Map<Character, Integer> freqMap = new HashMap<>();

    // 2. Smash the word into individual letters
    char[] letters = word.toCharArray();

    // 3. Loop through every letter and count it
    for (char letter : letters) {
        freqMap.put(letter, freqMap.getOrDefault(letter, 0) + 1);
    }

    // 4. Hand back the finished tally sheet
    return freqMap;
}
    */

        /*
        //  Variant 3: Increment/Decrement Pattern
        String s1 = "listen";
        String s2 = "silent";
        // Check if two strings are anagrams with single map
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            int updated = freq.getOrDefault(c, 0) - 1;
            if (updated < 0) return false;  // s2 has a char s1 doesn't have enough of
            freq.put(c, updated);
        }
        return true;
         */

        // Variant 4: Fixed-Size Array
        // Character frequency using array[26]
        int[] freq = new int[26];
        String s = "listen";
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }













    }
}