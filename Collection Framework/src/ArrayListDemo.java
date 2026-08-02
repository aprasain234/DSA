import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Object> result = new ArrayList<>();
        result.add(100);
        result.add(200);
        result.add("Aaaaa");
        result.remove(String.valueOf("Aaaaa"));

        System.out.println(result);
    }
}