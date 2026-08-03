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
    }
}