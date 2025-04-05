package lab5.problem1.obj;

import lab5.problem1.Duck;
import lab5.problem1.action.Flyable;
import lab5.problem1.action.Quackable;

public class RedHeadDuck  extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("flying with wings");
    }

    @Override
    public void quack() {
        System.out.println("quacking");
    }
}
