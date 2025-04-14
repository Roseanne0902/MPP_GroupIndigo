package lab9.prob2;

record Constant(int a) implements Expression {
    @Override
    public int eval() {
        return a;
    }
}
