package lab10.problem1.prob2B;

import java.util.function.Supplier;

public class prob_ii {
    public static void main(String[] args) {
        // Create an inner class to output the random value
        class RandomSupplier implements Supplier<Double> {
            @Override
            public Double get() {
                return (Double) Math.random();
            }
        }

        Supplier<Double> randomSupplier = new RandomSupplier();
        System.out.println("Random number: " + randomSupplier.get());
    }
}