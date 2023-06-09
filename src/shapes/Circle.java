package shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
    public double getCircumference(){
        return Math.PI * (this.radius * 2);
    }

}
