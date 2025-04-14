package lab9.prob2;

public sealed interface Expression permits Addition, Constant, Multiplication {

    int eval();

}
