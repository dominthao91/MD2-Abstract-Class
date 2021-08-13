package interfaceComparable;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Circle() {
        radius = 1.0;
        color = "green";
        filled = true;
    }
    public Circle(double _radius){
        radius = _radius;
        color = "green";
        filled = true;
    }

    public Circle(double _radius, String _color, boolean _filled) {
        radius = _radius;
        color = _color;
        filled = _filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPrimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + ": " + color;
    }

}
