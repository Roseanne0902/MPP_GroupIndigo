package lab11.partB.prob10;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Or {
    public boolean someSimpleIsTrue(List<Simple> list) {
        return list.stream().map(s -> s.flag).reduce(false, (b1, b2) -> b1 || b2);
    }


    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
        Or main = new Or();
        System.out.println(main.someSimpleIsTrue(list));

        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(", ")));

        IntSummaryStatistics myIntStream = Stream.of(1, 5, 7, 8, 9).collect(Collectors.summarizingInt((Integer x) -> x));
        System.out.println("Max: "+ myIntStream.getMax() + " Min: "+myIntStream.getMin() );
    }
}