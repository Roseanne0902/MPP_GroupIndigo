public class Cylinder {

    private double radius;
     double height;
     Circle circle;

    public Cylinder(double radius, double height) {
       this.radius = radius;
        this.height = height;
        circle= new Circle(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double computeVolume(){
        return circle.computeArea(radius) * height;
    }
}

