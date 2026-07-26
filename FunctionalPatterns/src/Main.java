import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1. getOrDefault: safe frequency counting
        map.getOrDefault(key, 0);  // Returns 0 if key not found

// 2. computeIfAbsent: build adjacency lists cleanly
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.computeIfAbsent(node, k -> new ArrayList<>()).add(neighbor);

// 3. merge: concise frequency counting
        map.merge(key, 1, Integer::sum);  // Increment count by 1

// 4. putIfAbsent: set a value only if key is not already present
        map.putIfAbsent(key, defaultValue);

// 5. entrySet: iterate over key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
        }


        // Without computeIfAbsent (verbose)
        if (!graph.containsKey(node)) {
            graph.put(node, new ArrayList<>());
        }
        graph.get(node).add(neighbor);

// With computeIfAbsent (clean)
        graph.computeIfAbsent(node, k -> new ArrayList<>()).add(neighbor);

    }
}