package Ex3;

public class Geometry {
    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static double triangleArea(double base, double height) {
        return base * height / 2;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double cubeArea(double side) {
        return 6 * side * side;
    }

    public static double parallelepipedArea(double base, double height, double depth) {
        return 2 * (base * height + base * depth + height * depth);
    }

    public static double trapezeArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

    public static double sphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }
}
