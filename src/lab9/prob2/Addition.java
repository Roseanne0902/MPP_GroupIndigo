package lab9.prob2;

record Addition(Expression a, Expression b) implements Expression {
    @Override
    public int eval() {
        return a.eval() + b.eval();
    }
}
