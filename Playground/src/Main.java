import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// int[] to List<Integer> (no one-liner for primitives)
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

// List<Integer> to int[]
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);

// String <-> char[]
        char[] chars = str.toCharArray();
        String str = new String(chars);

// String <-> int
        int num = Integer.parseInt("42");
        String str = String.valueOf(42);

// int <-> long
        long big = (long) smallInt;
        int small = (int) bigLong;  // Careful: truncates if value exceeds int range

// Array to List (for object arrays only)
        String[] arr = {"a", "b", "c"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));

// List to array
        String[] arr = list.toArray(new String[0]);


        int minVal = Integer.MAX_VALUE;  // 2,147,483,647
        int maxVal = Integer.MIN_VALUE;  // -2,147,483,648
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }
    }
}