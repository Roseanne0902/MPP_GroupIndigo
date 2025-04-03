public class CircleA extends CylinderA{
    public CircleA(){
        super();
    }

    public double computeArea(){
        return Math.PI * getRadius() * getRadius();
    }
}
