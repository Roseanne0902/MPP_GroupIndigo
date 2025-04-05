package lab5.problem1;

import lab5.problem1.obj.DecoyDuck;
import lab5.problem1.obj.MallardDuck;
import lab5.problem1.obj.RedHeadDuck;
import lab5.problem1.obj.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new MallardDuck(),
                new DecoyDuck(),
                new RedHeadDuck(),
                new RubberDuck(),
        };

        for (Duck d: ducks) {
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
        }
    }
}
