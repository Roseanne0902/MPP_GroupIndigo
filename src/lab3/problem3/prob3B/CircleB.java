package lab3.problem3.prob3B;

public class CircleB {

    private double radius;

    public CircleB(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(double radius) {
        return Math.PI * getRadius() * getRadius();
    }
}
