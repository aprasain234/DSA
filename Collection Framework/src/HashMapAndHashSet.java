import java.util.*;

public class HashMapAndHashSet {
    public static void main(String[] args) {
        /*
        // Frequency counting: the most common HashMap pattern
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Check existence and retrieve
        if (freq.containsKey('a')) {
        int count = freq.get('a');
        }

        // Safe retrieval (avoids NullPointerException)
        int count = freq.getOrDefault('z', 0);

        // Iterate over all entries
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
        char key = entry.getKey();
        int value = entry.getValue();
        }

        // Iterate over keys only
        for (Character key : freq.keySet()) { ... }

        // Iterate over values only
        for (Integer value : freq.values()) { ... }

        // Remove a key
        freq.remove('a');

        // Get size
        freq.size();
         */
        HashMap hashMap = new HashMap();
        hashMap.put("Aa", "First Value");
        hashMap.put("BB", "Second Value");

        System.out.println(hashMap.size());

        /*
1. The Frequency Map (Counting Occurrences)
This is the backbone of problems like Valid Anagram, Top K Frequent Elements, and Majority Element. Instead of checking if a key exists before incrementing, use getOrDefault to do it in one clean line.

Map<Integer, Integer> counts = new HashMap<>();
for (int num : nums) {
    // If 'num' exists, add 1 to its value. If not, default to 0 and add 1.
    counts.put(num, counts.getOrDefault(num, 0) + 1);
}
2. The Complement Look-Back (Two Sum Pattern)
Used in Two Sum and its variations. As you iterate through an array, you store the values you've seen so far in the map. For each new number, you check if the "complement" (what you need to hit your target) is already in the map.

Map<Integer, Integer> seen = new HashMap<>(); // Maps value -> index

for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];

    if (seen.containsKey(complement)) {
        return new int[] { seen.get(complement), i };
    }

    seen.put(nums[i], i);
}
3. The Grouper (Group Anagrams Pattern)
Whenever you need to group items by a specific trait (like grouping words that are anagrams of each other), you map a string or character to a List of items. The computeIfAbsent method prevents you from having to write messy if (map.containsKey()) logic to initialize the lists.

Map<String, List<String>> groups = new HashMap<>();

for (String s : strings) {
    String key = generateKey(s); // Some custom method to get the group key

    // If the key isn't in the map, it creates a new ArrayList.
    // Then it adds the string to that list.
    groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
}
4. The Sliding Window Index Tracker
Used in problems like Longest Substring Without Repeating Characters. You use the map to store the exact index where you last saw a specific character, allowing you to instantly jump the left side of your window forward when you hit a duplicate.

Map<Character, Integer> charIndexMap = new HashMap<>();
int left = 0, maxLength = 0;

for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);

    // If we've seen the char and it's inside our current window, move 'left'
    if (charIndexMap.containsKey(c) && charIndexMap.get(c) >= left) {
        left = charIndexMap.get(c) + 1;
    }

    charIndexMap.put(c, right); // Update the most recent index
    maxLength = Math.max(maxLength, right - left + 1);
}
       */


        /*
        HashSet provides O(1) membership testing:
        Set<Integer> visited = new HashSet<>();
        visited.add(node);           // Returns true if newly added, false if already present
        visited.contains(node);      // O(1) lookup
        visited.remove(node);        // O(1) removal
        visited.size();              // Number of elements
         */

    }
}
