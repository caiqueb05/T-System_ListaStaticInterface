package Ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println("The are of a square with side 2 is: " + Geometry.squareArea(2));
        System.out.println("The are of a rectangle with base 2 and height 2 is: " + Geometry.rectangleArea(2, 2));
        System.out.println("The are of a triangle with base 2 and height 2 is: " + Geometry.triangleArea(2, 2));
        System.out.println("The are of a circle with radius 2 is: " + Geometry.circleArea(2));
        System.out.println("The are of a cube with side 2 is: " + Geometry.cubeArea(2));
        System.out.println("The are of a parallelepiped with base 2, height 2 and depth 2 is: " + Geometry.parallelepipedArea(2, 2, 2));
        System.out.println("The are of a trapeze with base1 2, base2 2 and height 2 is: " + Geometry.trapezeArea(2, 2, 2));
        System.out.println("The are of a sphere with radius 2 is: " + Geometry.sphereArea(2));
    }
}
