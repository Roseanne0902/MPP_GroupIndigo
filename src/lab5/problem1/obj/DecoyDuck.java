package lab5.problem1.obj;

import lab5.problem1.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("can not fly");
    }

    @Override
    public void quack() {
        System.out.println("can not quack");
    }
}
