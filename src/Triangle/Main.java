package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.println("Hãy nhập độ dài cạnh 1 : ");
        double number1 = input.nextDouble();
        System.out.println("Hãy nhập độ dài cạnh 2 : ");
        double number2 = input.nextDouble();
        System.out.println("Hãy nhập độ dài cạnh 3 : ");
        double number3 = input.nextDouble();

        triangle = new Triangle(number1,number2,number3);
        System.out.println(triangle);
        System.out.println("Area = " +  triangle.getArea());
        System.out.println("Perimerter = " + triangle.getPerimerter());

        System.out.println();
        Shape shape = new Shape();
        System.out.println(shape);
        System.out.println("Area = " + shape.getArea());
        System.out.println("Perimerter = " + shape.getPerimerter());

    }
}
