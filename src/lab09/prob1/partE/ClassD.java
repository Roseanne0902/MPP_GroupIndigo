package lab09.prob1.partE;


interface A1 {
    default void method() {
        System.out.println("A");
    }
}

interface B1 extends A1 {
    default void method() {
        System.out.println("B");
    }
}

interface C1 extends A1 {
    default void method() {
        System.out.println("C");
    }
}

abstract class E1 {
    public void method() {
        System.out.println("E1");
    }
}

public class ClassD implements B1, C1 {
    @Override
    public void method() {

        B1.super.method();
        // or C1.super.method()
    }
}

