package lab09.prob1.partE;

interface A3 {
    default void method() {
        System.out.println("interface A3");
    }
}

abstract class E3 {
    public void method() {
        System.out.println("abstract E3");
    }
}

public class ClassD3 extends E3 implements A3 {
    public static void main(String[] args) {
        ClassD3 classD3 = new ClassD3();
        classD3.method();
    }
}

