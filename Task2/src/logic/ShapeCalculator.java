package logic;

import shapes.*;

public class ShapeCalculator {
    public static void printShapeInfo(Shape shape) {
        System.out.println("Площа: " + shape.calculateArea());

        if (shape instanceof Shape3D shape3D) {
            System.out.println("Об'єм: " + shape3D.calculateVolume());
        }
    }
}
