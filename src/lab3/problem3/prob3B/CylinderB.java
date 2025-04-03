package lab3.problem3.prob3B;

public class CylinderB {

    private double radius;
    double height;

    CircleB circle;

    public CylinderB(double radius, double height) {
        this.radius = radius;
        this.height = height;
        circle = new CircleB(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double computeVolume() {
        return circle.computeArea(radius) * height;
    }
}

