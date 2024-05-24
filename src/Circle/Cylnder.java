package Circle;

public class Cylnder extends Circle {
    private double height;

    public Cylnder() {
        super();
    }

    public Cylnder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String Volume() {
        return ("Volume = " + getRadius() * this.height * Math.PI * 2);
    }

    @Override
    public String toString() {
        return "Cylnder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", height=" + height +
                '}';
    }
}
