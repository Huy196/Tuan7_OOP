package Triangle;

public class Shape extends Triangle{
    public Shape() {
        super();
    }


    @Override
    public String toString() {
        return "Shape {" +
                "side1 = " + getSide1() +
                ", side2 = " + getSide2() +
                ", side3 = " + getSide3() +
                '}';
    }
}
