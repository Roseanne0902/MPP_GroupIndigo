package lab5.problem1;

import lab5.problem1.action.Flyable;
import lab5.problem1.action.Quackable;

public abstract class Duck implements Flyable, Quackable {
    void swim() {
        System.out.println("swimming");
    }

    public void display() {
        System.out.println("display");
    }
}
