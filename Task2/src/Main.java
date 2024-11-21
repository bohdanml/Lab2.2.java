import logic.ShapeCalculator;
import shapes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть фігуру:");
        System.out.println("1. Трикутник");
        System.out.println("2. Прямокутник");
        System.out.println("3. Коло");
        System.out.println("4. Куб");
        System.out.println("5. Сфера");
        System.out.println("6. Піраміда");

        final int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Введіть основу і висоту трикутника: ");
                final double base = scanner.nextDouble();
                final double height = scanner.nextDouble();
                Shape2D triangle = new Triangle(base, height);
                ShapeCalculator.printShapeInfo(triangle);
            }
            case 2 -> {
                System.out.print("Введіть довжину і ширину прямокутника: ");
                final double length = scanner.nextDouble();
                final double width = scanner.nextDouble();
                Shape2D rectangle = new Rectangle(length, width);
                ShapeCalculator.printShapeInfo(rectangle);
            }
            case 3 -> {
                System.out.print("Введіть радіус кола: ");
                final double radius = scanner.nextDouble();
                Shape2D circle = new Circle(radius);
                ShapeCalculator.printShapeInfo(circle);
            }
            case 4 -> {
                System.out.print("Введіть довжину сторони куба: ");
                final double side = scanner.nextDouble();
                Shape3D cube = new Cube(side);
                ShapeCalculator.printShapeInfo(cube);
            }
            case 5 -> {
                System.out.print("Введіть радіус сфери: ");
                final double radius = scanner.nextDouble();
                Shape3D sphere = new Sphere(radius);
                ShapeCalculator.printShapeInfo(sphere);
            }
            case 6 -> {
                System.out.print("Введіть площу основи і висоту піраміди: ");
                final double baseArea = scanner.nextDouble();
                final double height = scanner.nextDouble();
                Shape3D pyramid = new Pyramid(baseArea, height);
                ShapeCalculator.printShapeInfo(pyramid);
            }
            default -> System.out.println("Неправильний вибір" +" ");
        }

        scanner.close();
    }
}
