package lab10.problem1.prob1B;

// Part i: Method reference rewritten as a lambda expression
import java.util.function.Supplier;

public class prob_i_ii {
    public static void main(String[] args) {
        // i. Lambda version
        // () -> Math.random()

        // ii. Put the lambda method into a main and output it
        Supplier<Double> lambdaRandom = () -> Math.random();
        System.out.println("Lambda random number: " + lambdaRandom.get());
    }
}