package lab09.prob2;

record Multiplication(Expression a, Expression b) implements Expression {
    @Override
    public int eval() {
        return a.eval() * b.eval();
    }
}
