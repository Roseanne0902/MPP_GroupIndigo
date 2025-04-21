package lab11.partA.prob3;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    final Supplier<Stream<Integer>> streamSupplier = () ->
            Stream.iterate(2, i -> i + 1)
                    .filter(this::isPrime);


    public void printFirstNPrimes(long n) {
        List<Integer> bbb = streamSupplier.get().limit(n).toList();
        System.out.println(bbb);
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

}
