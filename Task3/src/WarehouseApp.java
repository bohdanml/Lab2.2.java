import data.Product;
import logic.Warehouse;

public class WarehouseApp {
    public static void main(String[] args) {
        final Warehouse warehouse = new Warehouse(10, 10, 10);

        final Product product1 = new Product("Товар 1", 5, 5, 5);
        final Product product2 = new Product("Товар 2", 11, 5, 5);
        final Product product3 = new Product("Товар 3", 5, 5, 5);
        final Product product4 = new Product("Товар 4", 11, 5, 5);
        final Product product5 = new Product("Товар 5", 7, 7, 7);
        final Product product6 = new Product("Товар 6", 5, 5, 5);
        final Product product7 = new Product("Товар 7", 5, 5, 5);
        final Product product8 = new Product("Товар 8", 5, 5, 5);

        warehouse.addProduct(product1);
        warehouse.addProduct(product2);
        warehouse.addProduct(product3);
        warehouse.addProduct(product4);
        warehouse.addProduct(product5);
        warehouse.addProduct(product6);
        warehouse.addProduct(product7);
        warehouse.addProduct(product8);

        System.out.println("Список товарів на складі:");
        for (Product product : warehouse.getProducts()) {
            System.out.println(product);
        }
    }
}
