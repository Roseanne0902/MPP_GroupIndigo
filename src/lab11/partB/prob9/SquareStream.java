package lab11.partB.prob9;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SquareStream {


    public static void printSquares(int n) {
        List<Integer> bbb = Stream.iterate(1, i -> (int) ((Math.sqrt(i) + 1) * (Math.sqrt(i) + 1))).limit(n).toList();
        System.out.println(bbb);
    }

    public static void main(String[] args) {
        printSquares(4);
        printSquares(5);

    }

}
