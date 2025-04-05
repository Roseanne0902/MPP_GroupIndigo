package lab5.problem1.obj;

import lab5.problem1.Duck;

public class MallardDuck extends Duck  {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }

    @Override
    public void quack() {
        System.out.println("quacking");
    }
}
