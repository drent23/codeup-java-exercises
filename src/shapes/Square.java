package shapes;
public class Square extends Rectangle {
    protected float side;
    public Square (float side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public float getPerimeter() {
        return 4 * side;
    }
    @Override
    public float getArea() {
        return (float) Math.pow(side, 2);
    }
}
