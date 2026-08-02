import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        /*
        // Declaration and initialization
        int[] nums = new int[5];            // [0, 0, 0, 0, 0] (defaults to 0)
        int[] nums = {1, 2, 3, 4, 5};      // Literal initialization
        boolean[] visited = new boolean[n]; // defaults to false
        String[] words = new String[n];     // defaults to null
        */


        /*
        int[] arr = {1, 2, 3};
        arr.length      // 3 (property, no parentheses)
        String s = "hello";
        s.length()      // 5 (method, with parentheses)
        List<Integer> list = new ArrayList<>();
        list.size()     // 0 (method, with parentheses)
         */

        /*
        2D Arrays:
        int[][] matrix = new int[rows][cols];
        // Access: matrix[row][col]
        // Row count: matrix.length
        // Column count: matrix[0].length
         */

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars.length); // Outputs 4
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println("Car at index " + i + " is " + cars[i]);
//        }

        String[] names = {"A", "B", "C", "D"};
        int x = List.of(names).indexOf("C");
        System.out.println(x);

        int[] numbers = {1,2,3,4,5};
        int value = numbers[2];
        System.out.println("Element at index " + "2" + " = " + value);

        // Traversal: visit each element exactly once
        int[] arr = {3,8,12,17,88,95,32};
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}