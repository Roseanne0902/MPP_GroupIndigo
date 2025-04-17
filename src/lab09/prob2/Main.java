package lab09.prob2;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Multiplication(
                new Addition(
                        new Constant(2),
                        new Constant(3)
                ),
                new Constant(4)
        );

        int result = expression.eval();
        System.out.println("Result: " + result);
    }
}
