package shapes;

public class Pyramid implements Shape3D {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return baseArea;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseArea * height;
    }
}
