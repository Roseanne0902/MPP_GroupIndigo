package lab3.problem3.prob3A;


public class CircleA extends CylinderA {
    public CircleA() {
        super();
    }

    public double computeArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
