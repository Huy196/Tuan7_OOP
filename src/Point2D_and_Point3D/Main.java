package Point2D_and_Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D = new Point2D(3.5f,4.2f);
        System.out.println(point2D);


        Point3D point3D = new Point3D();
        point3D = new Point3D(3.5f,42.0f,5.0f);
        System.out.println(point3D);
    }
}
