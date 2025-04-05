package lab5.problem1.action;

public class CannotFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can not fly");
    }
}
