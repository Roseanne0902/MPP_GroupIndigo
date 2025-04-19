package lab03.problem3.prob3B;

public class CylinderB {

    private double height;

    CircleB circle;

    public CylinderB(double radius, double height) {
        this.height = height;
        circle = new CircleB(radius);
    }

    public double computeVolume() {
        return circle.computeArea() * getHeight();
    }

    public double getHeight() {
        return height;
    }
}

