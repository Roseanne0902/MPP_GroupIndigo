package lab3.problem3.prob3A;


public class CylinderA extends CircleA{
    double height;


    public CylinderA(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public CylinderA() {

    }
    public double getRadius() {
        return radius;
    }


    public double computeVolume() {
        return 3.14 * getRadius() * getRadius() * height;
    }
}
