package Chacon;

public class Rectangle extends Cha_con{
    private double width;
    private double height;
    public Rectangle(){}

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, String filled, double width,double height) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
