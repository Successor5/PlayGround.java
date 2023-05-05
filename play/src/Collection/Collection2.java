package Collection;

import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(30);
        Queue<Integer> collection = new LinkedList<>();
        collection.add(11);
        collection.add(12);
        collection.add(13);
        nums.add(1,100);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.addAll(collection);


        List<String> words = Arrays.asList("QWERY");
    }
}
