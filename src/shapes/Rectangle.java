package shapes;
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
//    protected float width;
//    protected float length;
//    public Rectangle (float width, float length) {
//        this.width = width;
//        this.length = length;
//    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter(){
        return (2 * width) + (2 * length);
    }
}
