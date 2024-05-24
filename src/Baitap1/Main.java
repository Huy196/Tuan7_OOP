package Baitap1;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(3.3F, 52.4F);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        movablePoint = new MovablePoint(3.6F, 35.6F);
        System.out.println(movablePoint);

        System.out.println(movablePoint.move());
    }
}
