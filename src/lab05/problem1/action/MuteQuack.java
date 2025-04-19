package lab05.problem1.action;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("can not quack");
    }
}
