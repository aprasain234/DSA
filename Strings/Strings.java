public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");          // modifies sb
        String result = sb.toString(); // "Hello World"
        System.out.println(result);

        String a = new String("hello");
        String b = new String("hello");

        boolean b1 = a == b;// false (compares references, different objects)
        a.equals(b);  // true (compares content)
        System.out.println(b1);

        String message = "Hello";
        message.toUpperCase();      // Creates a new string "HELLO", but doesn't save it anywhere!
        System.out.println(message); // Still prints "Hello"

// To actually capture the change, you must reassign it:
        message = message.toUpperCase(); // Now 'message' points to the new "HELLO" object

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(i).append(", "); // Modifies the same object in memory!
        }
        String finalResult = builder.toString();
        System.out.println(finalResult);
    }
}

/*

The Golden Rule of Comparison: Always use .equals() to compare Strings, not ==.
== checks if two variables point to the exact same memory location.
.equals() checks if the actual text value is the same.

| Method                | Returns  | Example              | DSA Use                                           |
|-----------------------|----------|----------------------|---------------------------------------------------|
| `charAt(i)`           | `char`   | `s.charAt(0)`        | Access individual characters                      |
| `length()`            | `int`    | `s.length()`         | Loop bounds (note: parentheses, unlike arrays)    |
| `substring(start,end)`| `String` | `s.substring(0, 3)` | Extract portions (start inclusive, end exclusive)|
| `toCharArray()`       | `char[]` | `s.toCharArray()`    | When you need in-place modification               |
| `split(regex)`        | `String[]`| `s.split(" ")`      | Tokenize strings                                 |
| `indexOf(str)`        | `int`    | `s.indexOf("ab")`    | Find substrings (-1 if not found)                 |
| `equals(other)`       | `boolean`| `s.equals(t)`        | Content comparison                                |
| `compareTo(other)`    | `int`    | `s.compareTo(t)`     | Lexicographic comparison                          |
| `trim()`              | `String` | `s.trim()`           | Remove leading/trailing whitespace                |
| `isEmpty()`           | `boolean`| `s.isEmpty()`        | Check if length is 0                              |
| `startsWith(prefix)`  | `boolean`| `s.startsWith("ab")` | Prefix check                                      |
| `contains(seq)`       | `boolean`| `s.contains("ab")`   | Substring check                                   |
*/