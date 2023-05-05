package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>(30);
        nums.add(2);
        nums.add(11);
        nums.add(12);
        nums.add(14);
        nums.remove(0);
        System.out.println(nums);
    }
}
