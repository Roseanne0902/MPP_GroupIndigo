package lab13.prob1.b;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        // Wildcard can add null only
//        nums.add(3.14);
        nums.add(null);

    }
}
