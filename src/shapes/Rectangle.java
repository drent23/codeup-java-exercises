package shapes;
public class Rectangle {
    protected float width;
    protected float length;
    public Rectangle (float width, float length) {
        this.width = width;
        this.length = length;
    }
    public float getArea() {
        return width * length;
    }
    public float getPerimeter(){
        return (2 * width) + (2 * length);
    }
}
