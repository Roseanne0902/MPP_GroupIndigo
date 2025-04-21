package lab13.prob1.a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

//        List<Integer> is not subclass of List<Number>
        List<Number> nums = ints;
        nums.add(3.14);
    }
}
