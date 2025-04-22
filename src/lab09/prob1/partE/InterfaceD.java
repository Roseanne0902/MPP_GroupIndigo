package lab09.prob1.partE;


interface A2 {
    default void method() {
        System.out.println("A");
    }
}

interface B2 extends A2 {
    default void method() {
        System.out.println("B");
    }
}

interface C2 extends A2 {
    default void method() {
        System.out.println("C");
    }
}

public interface InterfaceD extends B2, C2 {
    @Override
    default void method() {
        B2.super.method();
        // or C.super.method()
    }
}