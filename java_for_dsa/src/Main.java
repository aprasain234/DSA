public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // The syntax for ternary operator is: variable = (condition) ? expression_if_true : expression_if_false;
        // Ternary operator example
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);

        String names[] = {"Ashish", "Ashish1", "Ashish2"};
        for(String name : names) {
            System.out.println(name);
        }


    }
}
