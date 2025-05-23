package lab10.problem3;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

public class BiFunctionProb {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> func = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };

        List<Double> result = func.apply(2.0, 3.0);

        System.out.println(result);
    }
}