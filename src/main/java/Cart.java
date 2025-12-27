import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    // Конструктор
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Добавить товар
    public void addProduct(Product product) {
        products.add(product);
    }

    // Удалить товар по названию
    public void removeProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(productName)) {
                products.remove(i);
                break; // Удаляем только первый найденный товар
            }
        }
    }

    // Посчитать общую сумму
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Вывести содержимое корзины
    public void printCart() {
        System.out.println("=== Корзина ===");
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
            return;
        }

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }

        System.out.printf("Итого: %.1f руб.\n\n", getTotal());
    }
}