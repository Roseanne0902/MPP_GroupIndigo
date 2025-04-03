package lab3.problem3.prob3A;


public class CircleA {
    private double radius;

    public CircleA(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
