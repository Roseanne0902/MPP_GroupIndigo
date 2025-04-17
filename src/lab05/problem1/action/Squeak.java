package lab05.problem1.action;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeaking");
    }
}
