package Collection;

import java.util.LinkedList;
import java.util.List;

public class collection3 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("fola");
        names.add("malik");
        System.out.println(names);

        boolean b = names.contains("fola");
        System.out.println(b);
        
    }
}
