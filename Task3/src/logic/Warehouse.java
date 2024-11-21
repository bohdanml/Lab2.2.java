package logic;

import data.Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final int cellWidth;
    private final int cellHeight;
    private final int cellLength;
    private final List<Product> products = new ArrayList<>();

    public Warehouse(int cellWidth, int cellHeight, int cellLength) {
        this.cellWidth = cellWidth;
        this.cellHeight = cellHeight;
        this.cellLength = cellLength;
    }

    public void addProduct(Product product) {
        if (product.getWidth() > cellWidth || product.getHeight() > cellHeight || product.getLength() > cellLength) {
            System.out.println("Помилка: Розміри товару перевищують розміри комірки.");
            return;
        }

        if (products.size() >= 5) {
            System.out.println("Помилка: Комірка перевантажена.");
            return;
        }

        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
