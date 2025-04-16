# Part E answers

## The Diamond Problem
If a type `D` inherits from both `B` and `C`, and both `B` and `C` implement or override a method from `A`, **which version does `D` inherit?**

---

## Solution for two Scenarios

### i. When D is a Class

#### Rules:
- Java does not support multiple inheritance of classes.
- But it does support multiple interfaces with default methods.
- If a class implements multiple interfaces with conflicting default methods, the class must override the method.

#### Example:
```java
interface A {
    default void method() { System.out.println("A"); }
}

interface B extends A {
    default void method() { System.out.println("B"); }
}

interface C extends A {
    default void method() { System.out.println("C"); }
}

class D implements B, C {
    @Override
    public void method() {
        B.super.method(); // or C.super.method()
    }
}
```

#### So, if D is a class:
Java forces to resolve the ambiguity by explicitly overriding method() and choose which super.method() to call, or the class D has to get the same method() to override parents method().

---

### ii. When D is an Interface

#### Rules:
- If an interface D inherits from both B and C, and both override the same method from A, Java checks:
    - If both B and C provide the same method without conflict, D inherits it.
    - If there's a conflict, D must override and resolve it.

#### Example:
```java
interface A {
    default void method() { System.out.println("A"); }
}

interface B extends A {
    default void method() { System.out.println("B"); }
}

interface C extends A {
    default void method() { System.out.println("C"); }
}

interface D extends B, C {
    @Override
    default void method() {
        B.super.method(); // or C.super.method()
    }
}
```

#### So, if D is an interface:
Same as with a class — Java requires D to resolve the conflict if both parents provide conflicting defaults, or the class D has to get the same method() to override its parents method.