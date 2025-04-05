package lab5.problem1.obj;

import lab5.problem1.Duck;
import lab5.problem1.action.CannotFly;
import lab5.problem1.action.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
