package shapes;
public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

//    protected float side;
//    public Square (float side) {
//        super(side, side);
//        this.side = side;
    @Override
    public double getPerimeter() {
        return super.getLength() * 4;
    }
    @Override
    public double getArea() {
        return (double) Math.pow(super.getLength(), 2);
    }
}
