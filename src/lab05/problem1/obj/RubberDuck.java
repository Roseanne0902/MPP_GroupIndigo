package lab05.problem1.obj;

import lab05.problem1.Duck;
import lab05.problem1.action.CannotFly;
import lab05.problem1.action.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
