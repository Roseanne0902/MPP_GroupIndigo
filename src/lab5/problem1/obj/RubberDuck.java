package lab5.problem1.obj;

import lab5.problem1.Duck;
import lab5.problem1.action.CannotFly;
import lab5.problem1.action.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
