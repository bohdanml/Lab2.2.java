package data;

public class Product {
    private final String name;
    private final int width;
    private final int height;
    private final int length;

    public Product(String name, int width, int height, int length) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', width=" + width + ", height=" + height + ", length=" + length + "}";
    }
}
