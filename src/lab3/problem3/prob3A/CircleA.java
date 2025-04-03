package lab3.problem3.prob3A;


public class CircleA {
    double radius;

    public CircleA() {
        super();
    }

    public double computeArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
