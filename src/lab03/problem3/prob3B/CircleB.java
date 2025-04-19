package lab03.problem3.prob3B;

public class CircleB {

    private double radius;

    public CircleB(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
