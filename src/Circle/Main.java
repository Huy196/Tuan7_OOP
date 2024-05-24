package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(5.0,"red");
        System.out.println(circle);

        System.out.println(circle.area());

        Cylnder cylnder = new Cylnder();
        cylnder = new Cylnder(8.0,"black",4);
        System.out.println(cylnder);
        System.out.println(cylnder.Volume());
    }
}
