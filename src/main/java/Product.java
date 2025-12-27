public class Product {
    private String name;
    private double price;

    // Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString для красивого вывода
    @Override
    public String toString() {
        return String.format("%s - %.1f руб.", name, price);
    }
}