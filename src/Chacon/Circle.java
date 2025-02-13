package Chacon;

public class Circle extends Cha_con{
    /* mở rộng trường dữ liệu của lớp cha */
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
// cách 1
    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
//Cách 2
//    public Circle(double radius, String color, String filled) {
//        super();
//        this.radius = radius;
//        setColor(color);
//        setFilled(filled);
//    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }
}
