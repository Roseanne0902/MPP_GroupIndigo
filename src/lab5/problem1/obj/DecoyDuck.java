package lab5.problem1.obj;

import lab5.problem1.Duck;
import lab5.problem1.action.CannotFly;
import lab5.problem1.action.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new CannotFly(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
