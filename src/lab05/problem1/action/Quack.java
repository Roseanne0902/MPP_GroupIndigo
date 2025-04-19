package lab05.problem1.action;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quacking");
    }
}
