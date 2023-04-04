package shapes;

import org.w3c.dom.css.Rect;

import java.awt.font.LineBreakMeasurer;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(3, 6);
        System.out.println("box1 area = " + myShape.getArea());
        System.out.println("box1 perimeter = " + myShape.getPerimeter());
        myShape = new Square(4, 5);
        System.out.println("box2 area = " + myShape.getArea());
        System.out.println("box2 perimeter = " + myShape.getPerimeter());
    }
}
