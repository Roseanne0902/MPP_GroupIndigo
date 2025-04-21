package lab11.partB.prob7;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
        //expected output: [0, -1, -2, -3, -4, 4, -5, 5]
        ordering1(intList);
        List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
        //expected output: [cba, fie, doe, efg, set]
        ordering2(stringList);

//        List<Integer> numbers = Arrays.asList(5, -2, 2, 8, -1, 3);
//        Collections.sort(numbers, Comparator.comparingInt(Math::abs).thenComparingInt(Integer::valueOf));
//        System.out.println(numbers);  // Output: [-1, 2, 3, 5, 8]

    }

    //Orders the integers according to this pattern:
    // 0, -1, 1, -2, 2, -3, 3, . . .
    //Using this ordering, this method sorts the list as part of
    //a stream pipeline, and prints to the console
    public static void ordering1(List<Integer> list) {
        Comparator<Integer> comparator = Comparator.comparing((Integer a) -> Math.abs(a))
                .thenComparing((Integer a) -> a);
        System.out.println(list.stream().sorted(comparator).toList());

    }

    //Orders words by first reversing each and comparingin the usual way.
    // So
    //    cba precedes bed
    //since
    //    cba.reverse() precedes bed.reverse()
    //in the usual ordering
    //Using this ordering, this method sorts the list as part of
    //a stream pipeline, and prints to the console
    public static void ordering2(List<String> words) {
        Comparator<String> comparator = Comparator.comparing((String str) -> new StringBuilder(str).reverse().toString());
        System.out.println(words.stream().sorted(comparator).toList());
    }

}
