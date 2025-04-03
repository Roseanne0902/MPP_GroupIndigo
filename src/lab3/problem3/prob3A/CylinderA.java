package lab3.problem3.prob3A;


public class CylinderA extends CircleA {
    private double height;

    public CylinderA(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double computeVolume() {
        return 3.14 * getRadius() * getRadius() * getHeight();
    }

    public double getHeight() {
        return height;
    }
}
