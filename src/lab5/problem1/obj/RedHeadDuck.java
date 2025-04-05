package lab5.problem1.obj;

import lab5.problem1.Duck;
import lab5.problem1.action.FlyWithWings;
import lab5.problem1.action.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
